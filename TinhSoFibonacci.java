/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class TinhSoFibonacci {
    static long[] a = new long[94];
    public static void ktao() {
        a[0] = 1L; a[1] = 1L;
        for (int i = 2 ;i <= 93 ; i++) {
            a[i] = a[i-1] + a[i -2];
        }
    }
    public static void main(String[] args) {
        ktao();
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt();
        for (int i = 0;i < t ;i ++) {
            int n = sc.nextInt();
            System.out.println(a[n-1]);
        }
    }
}
