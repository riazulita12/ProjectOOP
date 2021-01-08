package com.company;

public class Balok implements Operasi{
    double p,l,t;

    @Override
    public double Luas() {
        return 2*((p*l)+(p*t)+(l*t)); //rumus luas balok
    }

    @Override
    public double Keliling() {
        return 4*(p+l+t);
    } //rumus keliling balok
}
