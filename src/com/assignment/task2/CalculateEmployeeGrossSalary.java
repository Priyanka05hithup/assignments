package com.assignment.assignment.task2;

import java.util.Scanner;

public class CalculateEmployeeGrossSalary {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Gross sal of Employee");
        double Gsla=0;
        double Esal=scn.nextDouble();
        if (Esal<=15000){
            Gsla=Esal*(.25+.82);
        }else if (Esal<=20200){
            Gsla=Esal*(.27+.90);
        }else if (Esal>20200){
            Gsla=Esal*(.36+.95);
        }
        System.out.println(Gsla);
    }
}
