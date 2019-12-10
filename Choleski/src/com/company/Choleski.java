package com.company;

public class Choleski {
    double[][] matrixL=  new double[3][3];
    double[][] matrixLTranspose = new double[3][3];

    //method to find lover triangle matrix
    public void choleskyDecompose(double matrixA[][]){
        for(int i = 0; i < matrixA.length; i++){
            for( int j = 0; j <= i; j++){
                double sum = 0;
                double res = 0;
                if(i == j) {
                    for(int k = 0; k < j; k++){
                        sum += Math.pow(matrixL[j][k], 2);
                    }
                    matrixL[j][j] = Math.sqrt(matrixA[j][j] - sum);
                }
                else{
                    for (int k = 0; k < j; k++) {
                        sum += (matrixL[i][k] * matrixL[j][k]);
                    }
                    matrixL[i][j] = (matrixA[i][j] - sum) / matrixL[j][j];;
                }
            }
        }
        calculateMatrixLTranspose();
    }

    //method to find transpose of matrixL
    private void calculateMatrixLTranspose(){
        for(int i = 0; i < matrixLTranspose.length; i++){
            for(int j = 0; j < matrixLTranspose[0].length; j++) {
                matrixLTranspose[i][j] = matrixL[j][i];
            }
        }
    }

    //calculates value when the row and column numbers match
    private double calculateSameNRPosition(int k, int i, double matrixA[][]){
        double res = 0;
        double sum = 0;
        for(int j = 0; j < k; j++){
            sum += Math.pow(matrixL[k][j], 2);
        }

            res = Math.sqrt(matrixA[k][k] - sum);

        return res;
    }

}
