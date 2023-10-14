//1304. Find N Unique Integers Sum up to Zero
//Given an integer n, return any array containing n unique integers such that they add up to 0.

//class Solution {
//    public int[] sumZero(int n) {
//        int arr[]=new int[n];
//        int start=1;
//        if(n%2==0){
//            for(int i=0;i<(arr.length/2)+1;i++){
//                arr[i]=start;
//                arr[arr.length-i-1]=-start;
//                start++;
//            }
//        }
//        else{
//            start=1;
//            arr[0]=0;
//            for(int i=1;i<(arr.length/2)+1;i++){
//                arr[i]=start;
//                arr[arr.length-i]=-start;
//                start++;
//            }
//        }
//        return arr;
//
//    }
//}