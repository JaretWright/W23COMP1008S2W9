package com.example.w23comp1008s2w9;

public class Tester {
    public static void main(String[] args) {
        try{
            Course course = new Course(2002,"COMP 1030","Programming Fundamentals");

            //add a toString() method that will return "20021-COMP 1030-Programming Fundamentals" to the Course class
            System.out.println(course);
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
