package com.company;

import java.util.Random;

public class Number {
    int max = 100;
    int n;
    int computer_number;
    Random r = new Random();



    public Number(int n) {

        this.max = max;
        this.n = n;

    }

    public int getN() {

        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
