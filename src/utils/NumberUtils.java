/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NumberUtils {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String mess, int min, int max) {
        while (true) {
            System.out.println(mess);
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    return n;
                } else {
                    System.err.println("Please input from " + min + " to " + max);
                }
            } catch (NumberFormatException e) {
                System.err.println("Input only integer number");
            }
        }
    }
}
