//1295. Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.

//class Solution {
//    public  int findNumbers(int[] nums) {
//        int count=0;
//
//        for(int i=0;i<nums.length;i++){
//            if(even(nums[i])){
//                count++;
//            }
//        }
//        return count;
//    }
//    public  boolean even(int number){
//        int count=0;
//        while(number>0){
//            count++;
//            number/=10;
//        }
//        if(count%2==0){
//            return true;
//        }
//        return false;
//    }
//}