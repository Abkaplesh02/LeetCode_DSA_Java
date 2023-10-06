import java.util.Arrays;

//1252. Cells with Odd Values in a Matrix
//There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
//
//For each location indices[i], do both of the following:
//
//Increment all the cells on row ri.
//Increment all the cells on column ci.
//Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
//
//
public class O14_Cells_with_Odd_Values_in_a_Matrix_1252 {

    public static int oddCells(int m, int n, int[][] indices) {
        int [][]arr=new int[m][n];
        for(int i=0;i<arr.length;i++){

        }

        for(int i=0;i<indices.length;i++){
            int a=indices[i][0];
            int b=indices[i][1];



            for(int j=0;j<arr.length;j++){
                arr[j][b]+=1;

            }

                for(int l=0;l<arr[i].length;l++){
                    arr[a][l]+=1;

            }

        }


        int count=0;
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
               if(arr[i][j]%2!=0){
                   count++;
               }
           }
       }
       return count;

    }

    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        int m=2;
        int n=3;

        System.out.println("the number of odd numbers are :: " + oddCells( m,  n, indices));
//        oddCells( m,  n, indices);
    }
}
