package com.assignment.task6;

import org.junit.Assert;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length=0;
        this.breadth=0;
    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(int side){
        this.length=side;
        this.breadth = side;
    }

    public void printArea(){
        System.out.println("Area is:"+ calculateArea());
    }
    public int calculateArea(){
        return this.length * this.breadth;
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(5,8);
        rectangle.printArea();

        Rectangle square = new Rectangle(5);
        square.printArea();

        Rectangle zeroSideShape = new Rectangle();
        zeroSideShape.printArea();

        Assert.assertEquals(40, rectangle.calculateArea());
        Assert.assertEquals(25, square.calculateArea());
        Assert.assertEquals(0, zeroSideShape.calculateArea());
    }
}
