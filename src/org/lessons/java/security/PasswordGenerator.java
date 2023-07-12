package org.lessons.java.security;

/*
-Name,Surname,Color,Birthdate
-generate password containing the info (print video(?))
 */

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//strings
    String userName = "Jam";
    String userSurname = "Timbol";
    String userColor = "Grey";
    int userDate = Integer.parseInt("20");
    int userMonth = Integer.parseInt("11");
    int userYear = Integer.parseInt("1996");

//value
//    userName = "Jam";
//    userSurname = "Timbol";
//    userColor = "Grey";
//    userDate = "20";
//    userMonth = "11";
//    userYear = "1996";

//sum
    int userPassDate = userDate + userMonth + userYear;

//gen
    System.out.println("Your Password is: " + userName + userSurname + userColor + userPassDate);
    }
}
