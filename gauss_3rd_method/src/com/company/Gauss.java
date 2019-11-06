package com.company;

public class Gauss {
    //the matrix of system of equations
    private double matrixArr[][] = new double [][]{{100, 100, 1, 1}, {0.2, 20, 1, 0}, {0.05, 0.2, 0.5, 1}};
    private double accuracy = 0.001;

    //to see the matrix
    //technically you don't need this function
    // :)
    public void showMatrix(){
        //System.out.println(matrixArr.length);
        for (int i = 0; i < matrixArr.length; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print( matrixArr[i][j] + " ");
            }
            //for new line
            System.out.println();
        }
    }


    //function to find the biggest value and divide the line by that value
    //idk if necessary for every step tho
    public void maxModFactorDivide(){

        for (int i = 0; i < 3; i ++){
            //sets max value as the first value of the line
            double max = matrixArr[i][0];
            //checks if any other element in the line is bigger and
            //changes the value if so
            for (int j = 0; j < 3; j ++){
                if (matrixArr[i][j] > max){
                    max = matrixArr[i][j];
                }
            }
            //divides the line by the biggest value
            for(int j = 0; j < 4; j ++){
                matrixArr[i][j] = matrixArr[i][j]/max;
            }
        }
    }


    //checks coeficient modals and switches lines if necessary
    //Makes a new array of coefficients. Dunno if this is needed
    //Will probably make it without the array.
    public void switchLines(){
        double Cmodal[] = new double[3];
        for (int i = 0; i < matrixArr.length; i ++){
            for (int j = 0; j < 4; j ++){
                //calculates the modal for a line
                Cmodal[i] = Math.abs(matrixArr[i][j]);
            }

        }
        //checks which modal is smallest and switches lines
        for (int i = 0; i < Cmodal.length; i++){
            double smallestModal = Cmodal[i];
            for (int j = i+1; j < Cmodal.length; j ++) {
                if (Cmodal[i] < Cmodal[j]){
                    smallestModal = Cmodal[j];
                    //switch line places in matrixArray here?
                    //probably no need for smallestModal variable
                    //only for testing
                }
            }
        }
    }
}
