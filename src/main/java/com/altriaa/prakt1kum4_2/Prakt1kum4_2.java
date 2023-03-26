/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altriaa.prakt1kum4_2;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Prakt1kum4_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        int n,un;
        System.out.println("Input Number of Traingle : ");
        n = sc.nextInt();
        for (n=n; n >= 1; n--){
            un = (int) (0.5*n*(n+1));
            System.out.println("Tringular number sequence: " + un);
        }
        System.out.println("The triangular number sequence of your number"
                    + " triangle is on the top");
    }
}
