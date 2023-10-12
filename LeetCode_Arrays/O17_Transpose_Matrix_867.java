import java.util.Arrays;

//867. Transpose Matrix
//Given a 2D integer array matrix, return the transpose of matrix.
//
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
//class Solution {
//    public static int[][] transpose(int[][] matrix) {
//
//        int n=matrix[0].length;
//        int m=matrix.length;
//
//        int neww[][]=new int[n][m];
//
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                neww[j][i]=matrix[i][j];
//            }
//        }
//        return neww;
//    }
//}