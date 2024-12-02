package org.miu.lesson3.problem4;

import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

       while(true) {
           try {
               System.out.print(
                       """
                               Enter C for Circle
                               Enter R for Rectangle
                               Enter T for Triangle
                               """);
               String input = sc.next().toUpperCase().trim();
               switch (input) {
                   case "C" -> {
                       System.out.println("Enter the radius of the Circle");
                       double radius = sc.nextDouble();
                       Circle circle = new Circle(radius);
                       System.out.println(String.format("The area of Circle is: %.2f", circle.computeArea()));
                       String resp=toContinue();
                       if(resp.equals("y")) {
                           continue;
                       } else return;

                   }
                   case "R" -> {
                       System.out.println("Enter the width of the Rectangle");
                       double width = sc.nextDouble();
                       System.out.println("Enter the height of the Rectangle");
                       double height = sc.nextDouble();
                       Rectangle rectangle = new Rectangle(width, height);
                       System.out.println(String.format("The area of Rectangle is: %.2f", rectangle.computeArea()));
                       String resp=toContinue();
                       if(resp.equals("y")) {
                           continue;
                       } else return;
                   }
                   case "T" -> {
                       System.out.println("Enter the base of the Triangle");
                       double base = sc.nextDouble();
                       System.out.println("Enter the height of the Triangle");
                       double height = sc.nextDouble();
                       Triangle triangle = new Triangle(base, height);
                       System.out.println(String.format("The area of Triangle is: %.2f", triangle.computeArea()));
                       String resp=toContinue();
                       if(resp.equals("y")) {
                           continue;
                       } else return;
                   }
                   default -> {
                       System.out.println("Wrong option selected");
                       String resp=toContinue();
                       if(resp.equals("y")) {
                           continue;
                       } else return;
                   }
               }
               //double input = sc.nextDouble();
           } catch (Exception e) {
               System.out.println("Input valid arguments only");
               String resp=toContinue();
               if(resp.equals("y")) {
                   continue;
               } else return;
           }
       }
    }
    public static String toContinue(){
        System.out.println("Do you want to continue(y/n) :");
        return sc.next().trim().toLowerCase();
    }
}
