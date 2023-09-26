//1470: Shuffle the Array

import java.util.Arrays;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//
//        Return the array in the form [x1,y1,x2,y2,...,xn,yn].


//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int arr[]=new int[nums.length];
//
//        int start=0;
//        int start1=1;
//        for(int i=0;i<n;i++){
//            arr[start]=nums[i];
//            start+=2;
//        }
//        for(int i=n;i<nums.length;i++){
//            arr[start1]=nums[i];
//            start1+=2;
//        }
//
//        return arr;
//
//    }
//}