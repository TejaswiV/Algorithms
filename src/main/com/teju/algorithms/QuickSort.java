package com.teju.algorithms;

public class QuickSort {

    public static void main(String... args){

        int[] array = new int[args.length];
        for(int i = 0; i < args.length ; i++){
            array[i] = Integer.parseInt(args[i].trim());
        }
        for (int val:array) {
            System.out.print(val+" ");
        }

        quickSort(array);
        System.out.println();
        for (int val:array) {
            System.out.print(val+" ");
        }

    }

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if(left >= right){
            return;
        }
        int pivot = array[(left+right)/2];
        int index = processArray(array, left ,right, pivot);
        quickSort(array, left, index -1);
        quickSort(array, index, right);
    }

    private static int processArray(int[] array, int left, int right, int pivot) {
        while(left <= right){

            while(array[left] < pivot){
                left++;
            }
            while(array[right] > pivot){
                right--;
            }

            if(left <= right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }

        }
        return left;
    }

}
