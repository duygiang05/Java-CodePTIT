/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.lang.*;
import java.util.*;

public class UocSoNToLonNhat {
    
    private static long uocnto(long n) {
        long mx = 2;
        long tmp = (int)Math.sqrt(n);
        for(long i = 2; i <= tmp ;i ++) {
            if(n % i == 0) {
                mx = Long.max(mx, i);
                while(n % i == 0) {
                    n /= i;
                }
            }
        }
        if(n > 1) return n;
        return mx;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i ++) {
            long n = sc.nextLong();
            System.out.println(uocnto(n));
        }
    }
}
