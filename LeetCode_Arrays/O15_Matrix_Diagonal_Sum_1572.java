//1572. Matrix Diagonal Sum
//Given a square matrix mat, return the sum of the matrix diagonals.
//
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

class Solution {
   public int diagonalSum(int[][] mat) {
       int sum=0;

       int i=0;
       int j=0;
       while(i<mat.length ||j<mat[0].length){
           sum+=mat[i][mat[i].length-1-i];
           mat[i][mat[i].length-1-i]=0;

           if(i==j){
               sum+=mat[i][j];
               mat[i][j]=0;
           }
           i++;
           j++;


       }

       return sum;

   }
}