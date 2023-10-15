//1380. Lucky Numbers in a Matrix
//Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
//
//A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
//

import java.lang.reflect.Array;
import java.util.ArrayList;

//class Solution {
//    public List<Integer> luckyNumbers (int[][] matrix) {
//        ArrayList<Integer>list=new ArrayList<>();
//        for(int i=0;i<matrix.length;i++){
//
//            int minCol=maxRow(matrix,i);
//            int value=matrix[i][minCol];
//            if(maxCol(matrix,minCol,value)){
//                list.add(matrix[i][minCol]);
//            }
//        }
//
//        return list;
//    }
//    public static boolean maxCol(int matrix[][],int n,int value){
//        int max=matrix[0][n];
//        for(int i=1;i<matrix.length;i++){
//            if(matrix[i][n]>max){
//                max=matrix[i][n];
//            }
//        }
//        if(max==value){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public static int maxRow(int matrix[][],int m){
//        int min=0;
//
//        for(int i=0;i<matrix[0].length;i++ ){
//            if(matrix[m][min]>matrix[m][i]){
//                min=i;
//            }
//        }
//
//        return min;
//    }
//
//}