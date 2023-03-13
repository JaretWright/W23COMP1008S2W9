package com.example.w23comp1008s2w9;

public class DBUtility {
    //the user name and password should be what ever you use on YOUR mysql server
    private static String user = "student";
    private static String password = "student";

    //jdbc:mysql - this is telling the system which SQL driver to user
    //127.0.0.1:3306 - tells Java that mySQL server is at IP 127.0.0.1, port 3306
    //edmuse2023 - this is the database name
    private static String connectUrl = "jdbc:mysql://127.0.0.1:3306/edmuse2023";

}
