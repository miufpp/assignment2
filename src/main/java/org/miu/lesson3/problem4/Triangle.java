package org.miu.lesson3.problem4;

public record Triangle(double base, double height) {

    public double computeArea(){
        return 0.5*base*height;
    }
}
