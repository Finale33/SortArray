package com.example;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {2,6,3,19,8,45,34,22,44,12};
        //BubbleSorting bubbleSorting = new BubbleSorting();
        //bubbleSorting.bubbleSorting(ns);
        //InsertionSort insertionSort = new InsertionSort();
        //insertionSort.insertionSort(ns);
        //SelectionSort selectionSort = new SelectionSort();
        //selectionSort.selectionSort(ns);
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
