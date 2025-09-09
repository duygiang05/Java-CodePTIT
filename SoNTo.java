/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
public class SoNTo {
    public static boolean nto(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0 ; i < t; i ++) {
            int n = sc.nextInt();
            if (nto(n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
            
    }
}
