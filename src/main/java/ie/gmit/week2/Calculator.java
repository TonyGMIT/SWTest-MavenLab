package ie.gmit.week2;

public class Calculator {
    int firstNum;
    int secondNum;

    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int add()
    {
        int total = firstNum + secondNum;
        return total;
    }
}
