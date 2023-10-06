//1365. How Many Numbers Are Smaller Than the Current Number

import java.util.Arrays;

//        Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
//
//        Return the answer in an array.
class Solution {
   public static  int[] smallerNumbersThanCurrent(int[] nums) {

       int arr[]=new int[nums.length];


       for(int i=0;i<nums.length;i++){
           int count=0;
           int j;
           for( j=0;j<nums.length;j++){
               if(nums[i]>nums[j]){
                   count++;

               }
           }
           if(j==nums.length){
               arr[i]=count;
           }
       }
       return arr;

   }

}