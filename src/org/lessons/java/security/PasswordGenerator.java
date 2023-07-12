package org.lessons.java.security;
public class PasswordGenerator {
    public static void main(String[] args) {
//strings valued
    String userName = "Jam";
    String userSurname = "Timbol";
    String userColor = "Grey";
    int userDate = Integer.parseInt("20");
    int userMonth = Integer.parseInt("11");
    int userYear = Integer.parseInt("1996");
//sum
    int userPassDate = userDate + userMonth + userYear;
//gen
    System.out.println("Your Password is: " + userName + userSurname + userColor + "." + userPassDate);
    }
}
