package com.company;

import com.sun.jdi.DoubleValue;

public class Jacob {
    private double lineArr[][] = {{10, -1, 3, 11}, {2, 20, 3, 15}, {2, 1, 10, 14}};
    double answerArr[] = {0, 0, 0};
    private double accuracy = 0.001;
/*
    //res is what's after =
    public Jacob(double x1, double x2, double x3, double res,
                 double x4, double x5, double x6, double res2,
                 double x7, double x8, double x9, double res3){
        double lineArr[][] = {{x1, x2, x3, res}, {x4, x5, x6, res2}, {x7, x8, x9, res3}};
    }
*/
    private  void divideVar(int line, int var, double divider){
        lineArr[line][var] = lineArr[line][var]/divider;
    }

    /**
     * changes appropriate value sign (?)and divides the values(?)
     */
    private void switchVarSign(){
        int variable = 0;
        for(int i = 0; i < lineArr.length; i++){
            if (variable == 0) {
                //changes sign calue of other variables except res
                lineArr[i][1] = lineArr[i][1] * (-1);
                lineArr[i][2] = lineArr[i][2] * (-1);
                //divides each element by the current variable(?)
                for (int j = 0; j < lineArr[0].length; j++) {
                    divideVar(i, j, lineArr[i][variable]);
                }
            }
            if (variable == 1) {
                //changes sign calue of other variables except res
                lineArr[i][0] = lineArr[i][0] * (-1);
                lineArr[i][2] = lineArr[i][2] * (-1);
                //divides each element by the current variable(?)
                for (int j = 0; j < lineArr[0].length; j++) {
                    divideVar(i, j, lineArr[i][variable]);
                    }
                }
            if (variable == 2) {
                //changes sign calue of other variables except res
                lineArr[i][0] = lineArr[i][0] * (-1);
                lineArr[i][1] = lineArr[i][1] * (-1);
                //divides each element by the current variable(?)
                for (int j = 0; j < lineArr[0].length; j++) {
                    divideVar(i, j, lineArr[i][variable]);
                }
            }
            }
            variable++;
        }

    /**
     * Does teh thing
     * (calculates jacob's method till < accuracy
     */
    public void doTheThing(){
        for (int i = 0; i < lineArr.length; i++){
            double sum = 0;
            //iteration for answer array
            int answerArrI = 0;
            for (int j = 0; j < lineArr[0].length-1; j++){
                //multiply and add each element except last
                sum += lineArr[i][j]*answerArr[answerArrI];
            }
            //last variable of lineArr isn't multiplied, but must be added
            sum += lineArr[i][3];
            //set sum as the answer for the appropriate line
            answerArr[answerArrI] = sum;
            answerArrI++;
        }
    }

    public void checkAccuracy(){

    }



}
