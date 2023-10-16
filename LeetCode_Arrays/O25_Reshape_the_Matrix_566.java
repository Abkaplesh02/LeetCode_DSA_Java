//566. Reshape the Matrix

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
//
//You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
//
//The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
//
//If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
//
//
//class Solution {
//    public int[][] matrixReshape(int[][] mat, int r, int c) {
//        int row=mat.length;
//        int col=mat[0].length;
//
//        if((row*col)!=(r*c)){
//            return mat;
//        }
//        int arr[][]=new int[r][c];
//
//        int k=0;
//        int l=0;
//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                arr[k][l]=mat[i][j];
//                l++;
//                if(l==c){
//                    k++;
//                    l=0;
//                }
//            }
//        }
//        return arr;
//
//
//
//    }
//}