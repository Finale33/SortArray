package com.example;

import java.util.Arrays;

public class MergeSort {
    public void mergeSort(int[] s){
        int mid = s.length/2;
        if(s.length < 2)return;
        int[] s1 = Arrays.copyOfRange(s,0,mid);
        int[] s2 = Arrays.copyOfRange(s,mid,s.length);
        mergeSort(s1);
        mergeSort(s2);
        merge(s1,s2,s);
    }
    public void merge(int[] s1, int[] s2, int[] s){
        int i = 0, j = 0;
        while(i + j < s.length){
            if(j == s2.length || (i < s1.length && Math.min(s1[i],s2[j]) == s1[i])){
                s[i+j] = s1[i++];
            }else{
                s[i+j] = s2[j++];
            }
        }
    }
}
