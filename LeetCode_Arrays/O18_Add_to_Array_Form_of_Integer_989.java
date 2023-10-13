import java.util.ArrayList;
import java.lang.Long;

//989. Add to Array-Form of Integer
//The array-form of an integer num is an array representing its digits in left to right order.
//
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
//class Solution {
//    public List<Integer> addToArrayForm(int[] num, int k) {
//        ArrayList<Integer>list=new ArrayList<>();
//
//
//        int n=num.length-1;
//        int carry=0;
//        while(n>=0 && k>0){
//            int ans=num[n]+k%10+carry;
//            list.add(0,ans%10);
//            carry=ans/10;
//            n--;
//            k/=10;
//        }
//        while(n>=0){
//            int ans=num[n]+carry;
//            list.add(0,ans%10);
//            carry=ans/10;
//            n--;
//        }
//        while(k>0){
//            int ans=k%10+carry;
//            list.add(0,ans%10)t;
//            carry=ans/10;
//            k/=10;
//        }
//        if(carry!=0){
//            list.add(0,carry);
//        }
//        return list;
//    }
//}