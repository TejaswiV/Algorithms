package com.teju.algorithms;

import java.util.Arrays;

public class BinarySearch {

   public static  void main(String... args){

        String[] array = {"teju", "kondal", "chinni", "chinnodu", "nani", "vijaya"};
        binarySearch(array, "nani");

   }

   public static void binarySearch(String[] array, String search){

       String[] sortedArray = array.clone();
       Arrays.sort(sortedArray);

       System.out.println();
       int pos = binarysearchRecursive(sortedArray, 0, array.length-1, search);
       if(pos >= 0) {
           int index = findIndexInArray(array, sortedArray[pos]);
           System.out.println(search +" found at index "+index);
       }else{
           System.out.println(search +" not found");
       }
   }

    private static int findIndexInArray(String[] array, String val) {
        for(int i =0; i < array.length; i++){
            if(array[i].equals(val))
                return i;
        }
        return -1;
    }

    private static int binarysearchRecursive(String[] array, int left, int right, String search) {
        if(left > right){
            return -1;
        }

        int mid = left +((right-left)/2);
        if(array[mid].equals(search)){
            return mid;
        }else if(search.compareTo(array[mid]) < 0){
            return  binarysearchRecursive(array, left, mid-1,search);
        }else{
            return binarysearchRecursive(array, mid+1, right, search);
        }
    }

    private static int binarySearch(String[] array, int left, int right, String search) {

       if(left > right)
           return -1;

        while(left <= right) {
            int mid = left + ((right - left) / 2);
            if (array[mid].equals(search)) {
                return mid;
            } else if (search.compareTo(array[mid]) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
