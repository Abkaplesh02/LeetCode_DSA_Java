import java.util.Arrays;

//832. Flipping an Image
//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//
//To flip an image horizontally means that each row of the image is reversed.
//
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//For example, inverting [0,1,1] results in [1,0,0].
//
//class Solution {
//    public int[][] flipAndInvertImage(int[][] image) {
//        // Reverse(image);
//        // // Inverse(image);
//        // return  image;
//        for(int[] row :image){
//            for(int i=0;i<(image[0].length+1)/2;i++){
//                int temp=row[i]^1;
//                row[i]=row[image[0].length-i-1]^1;
//                row[image[0].length-1-i]=temp;
//            }
//        }
//        return image;
//
//    }

    //   public static void Reverse(int arr[][]) {

    // 	for(int i=0;i<arr.length;i++) {
    // 		int start=0;
    // 		int end=arr[i].length-1;
    // 		while(start<end) {
    // 			int temp=arr[i][start]^1;
    // 			arr[i][start]=arr[i][end] ^1;
    // 			arr[i][end]=temp;
    // 			start++;
    // 			end--;

    // 		}
    // 	}

    // }

    //   public static void Inverse(int arr[][]) {

    // 	for(int i=0;i<arr.length;i++) {
    // 		for(int j=0;j<arr[i].length;j++) {
    // 			arr[i][j]=arr[i][j]^1;
    // 		}
    // 	}
    // }
//}