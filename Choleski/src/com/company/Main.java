package com.company;

public class Main {

    public static void main(String[] args) {
        double[][] matrixA = new double[][]{{25, 15, -5}, {15, 18, 0}, {-5, 0, 11}};
        double[] matrixB = new double[]{35, 33, 6};
        OutputArray output = new OutputArray();
        Choleski choleski = new Choleski();


        choleski.choleskyDecompose(matrixA);
        System.out.println("lower triangle");
        output.outputMatrix(choleski.matrixL);
        System.out.println();
        System.out.println("Transpose");
        output.outputMatrix(choleski.matrixLTranspose);
        System.out.println();


        SOLE sole = new SOLE();
        sole.calculateAnswer(choleski.matrixL, choleski.matrixLTranspose, matrixB);
        System.out.println("x = " + sole.x + " y = " + sole.y + " z = " + sole.z);


    }
}
