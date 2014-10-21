package com.self.common;

/**
 * Created by sanket on 10/18/2014.
 */
public class Calculation {

    private int num1 ;

    private int num2 ;

    Calculation() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2 ;
    }

    public int subtract() {
        return num1 - num2 ;
    }

    public int division() {
        return num1 / num2 ;
    }

    public int multiply() {
        return num1 * num2 ;
    }
}
