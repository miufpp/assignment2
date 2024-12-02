package org.miu.lesson3.problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private String fName;
    private String lName;
    private LocalDate dob;
    private int age;
    private int maxHeartRate;
    private static final int RHR=70;
    private static final float LB=0.5F;
    private static final float UB=0.85f;
    private static final int MHR_CONST=220;


    public HeartRates(String fname, String lname, LocalDate dob) {
        this.fName = fname;
        this.lName = lname;
        this.dob = dob;
        this.age=calcAge();
        this.maxHeartRate=calcMaxHeartRate();
    }

    public int calcAge(){
        return Period.between(dob,LocalDate.now()).getYears();
    }

    public int calcMaxHeartRate(){
        return MHR_CONST - calcAge();
    }

    public int calcAvgHeartRate(){
        return calcMaxHeartRate()-RHR;
    }

    private double calcLBTHR(){
        return (calcAvgHeartRate()*LB)+RHR;
    }
    private double calcUBTHR(){
        return (calcAvgHeartRate()*UB)+RHR;
    }

    public void calcTargetHeartRateRange(){
        System.out.println(String.format("The Target Heart Rate Range is between %.2f and %.2f",calcLBTHR(),calcUBTHR()));
    }




    public String getFname() {
        return fName;
    }

    public void setFname(String fname) {
        this.fName = fname;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lname) {
        this.lName = lname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return  "First Name : " + fName  +
                "\nLast Name : " + lName +
                "\nAge : " + age +
                "\nDate of Birth :  " + dob +
                "\nMaximum Heart Rate : " + maxHeartRate;
    }
}
