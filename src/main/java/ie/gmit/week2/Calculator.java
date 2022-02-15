package ie.gmit.week2;

import javax.annotation.processing.Messager;

public class Calculator {
    int firstNum;
    int secondNum;

    public Calculator() {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }


    public int add(int firstNum, int secondNum) {
        int total = firstNum + secondNum;
        return total;
    }

    public int subtract(int firstNum, int secondNum) {
        if(firstNum >= 0 && firstNum < 1000 && secondNum >= 0 && secondNum < 1000){
            int total = firstNum - secondNum;
            return total;
        }
        else{
            String message = "Invalid Number";
            throw new IllegalArgumentException(message);
        }
    }

    public int multiply(int firstNum, int secondNum) {
        if(firstNum >= 0 && firstNum < 1000 && secondNum >= 0 && secondNum < 1000) {
            int total = firstNum * secondNum;
            return total;
        }
        else{
            String message = "Invalid Number";
            throw new IllegalArgumentException(message);
        }
    }

    public int divide(int firstNum, int secondNum) {
        int total = firstNum / secondNum;
        return total;
    }
}
