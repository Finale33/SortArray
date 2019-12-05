package com.example;
//time complexity is O(n*n)
public class InsertionSort {
    public void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int cur = arr[i];
            int j = i;
            while(j > 0 && arr[j-1] > cur){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = cur;
        }
    }
}
