package com.algorithms.sort;

public class QuickSortStrings {

    public static void main(String... array){
        for (String val:array) {
            System.out.print(val+" ");
        }
        quickSort(array);
        System.out.println();
        for (String val:array) {
            System.out.print(val+" ");
        }
    }
    
    public static void quickSort(String[] array){
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(String[] array, int left, int right) {

        if(left >= right){
            return;
        }

        String pivot = array[left+ ((right-left)/2)];
        int index = processArray(array, left,right, pivot);
        quickSort(array, left, index-1);
        quickSort(array, index,right);
    }

    private static int processArray(String[] array, int left, int right, String pivot) {

        while (left <= right){
            while(array[left].compareTo(pivot) < 0){
               left++;
            }

            while(pivot.compareTo(array[right]) < 0){
                right--;
            }
            if(left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }

        return left;

    }

    private static void swap(String[] array, int left, int right){
        String temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
