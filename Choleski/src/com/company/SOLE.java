/**
 * SYSTEM OF LINEAR EQUATIONS
 */

package com.company;


public class SOLE {

    double x1 = 1, x2 = 1, x3 = 1;
    double x = 1, y = 1, z = 1;
    //answer array?
    double Xmatrix[] = new double[3];

    public void calculateAnswer(double matrixL[][], double matrixLT[][], double matrixB[]) {
        x1 = matrixB[0]/(x1*matrixL[0][0]);
        x2 = (matrixB[1] - x1*matrixL[1][0])/(x2*matrixL[1][1]);
        x3 = (matrixB[2] - (x1*matrixL[2][0] + x2*matrixL[2][1]))/(x3*matrixL[2][2]);

        z = x3/(z*matrixLT[2][2]);
        y = (x2 - z*matrixLT[1][2])/(y*matrixLT[1][1]);
        x = (x1 - (z*matrixLT[0][0] + y*matrixLT[0][1]))/(x*matrixLT[0][2]);
    }
}
