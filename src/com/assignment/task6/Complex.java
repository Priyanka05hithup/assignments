package com.assignment.task6;

import org.junit.Assert;

public class Complex {
    private int a;
    private int b;

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(5, 7); //5+7i
        Complex c2 = new Complex(3, 4); //3+4i

        Complex sum = addition(c1, c2);
        Assert.assertEquals(8,sum.a);
        Assert.assertEquals(11,sum.b);
        System.out.println("Sum of "+c1.readComplexNumber() +" and "+c2.readComplexNumber() + " is: "+sum.readComplexNumber());

        Complex difference = subtraction(c1, c2);
        System.out.println("Difference of "+c1.readComplexNumber() +" and "+c2.readComplexNumber() + " is: "+difference.readComplexNumber());
        Assert.assertEquals(2,difference.a);
        Assert.assertEquals(3,difference.b);

        Complex product = multiplication(c1, c2);
        System.out.println("Product of "+c1.readComplexNumber() +" and "+c2.readComplexNumber() + " is: "+product.readComplexNumber());
        Assert.assertEquals(-13,product.a);
        Assert.assertEquals(41,product.b);

    }

    private static Complex multiplication(Complex c1, Complex c2) {
        return new Complex((c1.a*c2.a - c1.b*c2.b), (c1.b*c2.a + c1.a*c2.b));
    }

    private static Complex subtraction(Complex c1, Complex c2) {
        return new Complex(c1.a-c2.a, c1.b-c2.b);
    }

    private static Complex addition(Complex c1, Complex c2) {
        return new Complex(c1.a+c2.a, c1.b+c2.b);
    }
    private String readComplexNumber(){
        return a +"+"+ b+"i";
    }
}
