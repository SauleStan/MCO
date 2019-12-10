package com.company;

public class OutputArray {
    public void outputMatrix(double matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void outputMatrix(double matrix[]) {
        System.out.println("x = " + matrix[0] + " " +
                            "y = " + matrix[1] + " " +
                            "z = " + matrix[2]);
    }
}
