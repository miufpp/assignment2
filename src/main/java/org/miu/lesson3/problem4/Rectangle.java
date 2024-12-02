package org.miu.lesson3.problem4;

public final class Rectangle {
    private final double WIDTH;
    private final double LENGTH;

    public Rectangle(double width, double length){
        this.WIDTH=width;
        this.LENGTH=length;
    }

    public double computeArea(){
        return WIDTH*LENGTH;
    }

    public double getWidth() {
        return WIDTH;
    }

    public double getLength() {
        return LENGTH;
    }
}
