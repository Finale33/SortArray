package com.example;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public void quickSort(int[] arr){
        if(arr.length < 2) return;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= arr[0]){
                left.add(arr[i]);
            }else{
                right.add(arr[i]);
            }
        }
    }
}
