package Junk;

import java.util.Scanner;

public class Junk {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first name");
//        String first = sc.nextLine();
//
//        System.out.println("Enter last name ");
//        String last = sc.nextLine();
//
//        System.out.println("Hello " + first + " " + last);

        // only 6 & 8 are lucky

        for (int i = 0; i < 10; i++) {
                System.out.println(i);
            if (i == 6 || i == 8) {
                System.out.println( i + " is lucky");
            }
        } // end of loop
    }
}
