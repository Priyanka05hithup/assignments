package com.assignment.task6;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class EmployeeDetails {
    private String name,address;
    private int yearOfJoining;
    private double salary;

    public EmployeeDetails(String name,String address,int yearsOfJoining,double salary){
   this.name=name;
   this.address=address;
   this.yearOfJoining=yearsOfJoining;
   this.salary=salary;
    }
    public static void main(String[] args) {

        EmployeeDetails emp1=new EmployeeDetails("Ram","634 parkway blvd,apt-1009 irving TX",2003,10000);
        EmployeeDetails emp2=new EmployeeDetails("Gopal","543 westwood circle,apt-456 westland MI",1999,20000);
        EmployeeDetails emp3=new EmployeeDetails("Berma","796 dale drive,apt-1001 westland MI",2009,30600);

        List<EmployeeDetails> employees = Arrays.asList(emp1, emp2, emp3);
        /*employees.forEach(e -> {
            System.out.println(e);
        });*/

        employees.forEach(System.out::println);

        Rectangle rectangle = new Rectangle(5,8);
        Assert.assertEquals(40, rectangle.calculateArea());
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }
}
