//1512. Number of Good Pairs
//
//        Given an array of integers nums, return the number of good pairs.
//
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.


class Solution {
   public static  int numIdenticalPairs(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j] && i!=j){
                   count++;
               }
           }
       }
       return count;


   }
}