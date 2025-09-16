/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xaukitu;

/**
 *
 * @author PC
 */
import java.util.*;

public class ChiaHetCho11 {
    
    private static boolean check(String n) {
        int sum = 0;
        for(int i = 0; i < n.length(); i++) {
            int x = n.charAt(i) - '0';
            if(i % 2 == 0) sum += x;
            else sum -= x;
        }
        return sum % 11 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++) {
            String n = sc.nextLine();
            if(check(n)) System.out.println(1);
            else System.out.println(0);
        }
    }
}
