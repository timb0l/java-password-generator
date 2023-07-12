package org.lessons.java.security;
import java.util.Scanner;
public class BonusGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//strings
    String userName;
    String userSurname;
    String userColor;
    int userDate;
    int userMonth;
    int userYear;
//value-print
        System.out.println("Type name: ");
            userName = scan.next();
        System.out.println("Insert Surname: ");
            userSurname = scan.next();
        System.out.println("Insert Color: ");
            userColor = scan.next();
        System.out.println("Insert Birth Date: ");
            userDate = scan.nextInt();
        System.out.println("Insert Birht Month: ");
            userMonth = scan.nextInt();
        System.out.println("Insert Birht Year: ");
            userYear = scan.nextInt();
        scan.close();
    System.out.println("Your Password Is: " + userName + userSurname + userColor + userDate + userMonth + userYear);
    }
}
