//54: Maximum Subarray
//Given an integer array nums, find the
//subarray
// with the largest sum, and return its sum.
//class Solution {
//    public int maxSubArray(int[] nums) {
//        int maxSum=Integer.MIN_VALUE;
//        int currentS=0;
//
//        for(int i=0;i<nums.length;i++){
//            currentS+=nums[i];
//
//            maxSum=Math.max(maxSum,currentS);
//
//            if(currentS<0){
//                currentS=0;
//            }
//        }
//        return maxSum;
//    }
//}