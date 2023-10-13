//1854. Maximum Population Year


//You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
//
//The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
//
//Return the earliest year with the maximum population.
import java.util.ArrayList;

//class Solution {
//    public int maximumPopulation(int[][] logs) {
//        int Freq[]=new int[101];
//
//        for(int []log : logs){
//            int birth=log[0];
//            int death=log[1];
//            Freq[birth-1950]++;
//            Freq[death-1950]--;
//        }
//
//        int maxFreq=Freq[0];
//        int year=1950;
//
//        for(int i=1;i<101;i++){
//            Freq[i]+=Freq[i-1];
//            if(Freq[i]>maxFreq){
//                maxFreq=Freq[i];
//                year=1950+i;
//            }
//        }
//        return year;
//
//    }
//}