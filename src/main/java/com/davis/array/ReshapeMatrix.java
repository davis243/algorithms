package com.davis.array;

public class ReshapeMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] output = new int[r][c];
        int rows = mat.length;
        int cols = mat[0].length;
        if (rows * cols != r * c) return mat;

        int row_num = 0 ;
        int col_num = 0;

        for(int row=0; row<rows;row++){
            for(int col=0;col< cols;col++){
                output[row_num][col_num] = mat[row][col];
                col_num++;
                if(col_num == c){
                    col_num = 0;
                    row_num++;
                }
            }
        }
        return output;
     /*   int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;

        int[][] result = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return result;*/
    }

    public static void main(String[] args) {

        int nums[][] = {{1,2},{3,4}};

        int out [] [] = matrixReshape(nums, 2, 4);
        for(int i = 0; i<out.length; i++){
            for(int j= 0; j<out[0].length; j++){
                System.out.print(out[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}

