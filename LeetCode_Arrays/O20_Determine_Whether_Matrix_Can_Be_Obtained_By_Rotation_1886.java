import java.util.Arrays;

public class O20_Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation_1886 {

//    public static boolean findRotation(int[][] mat, int[][] target){
//
//        int row=mat.length;
//
//        for(int i=0;i<=3;++i){
//            int neww[][]=new int[row][row];
//hy7
//            for(int j=0;j<row;++j){
//                for(int l=0;l<row;++l){
//                    neww[l][row-1-j]=mat[i][j];
//                }
//                if(Arrays.deepEquals(neww,target)){
//                    return true;
//                }
//            }
//            mat=neww;
//
//
//        }
//        return false;
//    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int row = mat.length;

        for(int k=0;k<=3;++k){
            int[][] r = new int[row][row];
            for(int i =0;i<row;++i){
                for(int j =0;j<row;++j){
                    r[j][row-1-i]=mat[i][j];
                }
                if(Arrays.deepEquals(r,target)){
                    return true;
                }
            }
            mat = r;
        }
        return false;

    }

//    public static  boolean findRotation(int[][] mat, int[][] target) {
//        int n=mat.length;
//
//        int Rotat[][]=new int[n][n];
//        for(int l=0;l<=3;l++){
//
//
//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    Rotat[j][n-1-i]=mat[i][j];
//                }
//            }
//            if(Arrays.deepEquals(Rotat,target)){
//                return true;
//            }
//            mat=Rotat;
//        }
//
//return false;
//    }

    public static void main(String[] args) {
        int [][]mat = {{0,0,0},{0,1,0},{1,1,1}};
        int [][]target = {{1,1,1},{0,1,0},{0,0,0}};

       System.out.println(findRotation(mat,target));
//        findRotation(mat,target);

    }
}
