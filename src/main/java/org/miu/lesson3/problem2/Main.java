package org.miu.lesson3.problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please, enter your first name:");
        String fname=sc.next().trim();
        System.out.println("Please, enter your last name:");
        String lname=sc.next().trim();
        //add try-catch block here
        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd) - Example 1989-04-14");
        String dob=sc.next().trim();
        sc.close();

        HeartRates hr=new HeartRates(fname,lname,dob);
        hr.calcTargetHeartRateRange();
        System.out.println(hr);
    }
}
