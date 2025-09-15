/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class SoXaCach {
    private static boolean check(int [] x ,int n) { 
        for(int i = 2; i <= n ; i++) {
            if(Math.abs(x[i] - x[i-1]) == 1) return false;
        }
        return true;
    }
    
    private static void sinh(int n,int[] x, int [] u, int ind) {
        if(ind > n) {
            if(check(x,n)) {
                for(int i = 1; i <= n ;i ++) {
                    System.out.print(x[i]);
                }
                System.out.println(); return ;
            }
        }
        
        for(int j = 1; j <= n; j++) {
            if(u[j] == 0) {
                u[j] = 1;
                x[ind] = j;
                sinh(n,x,u,ind+1);
                u[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ;i < t ; i++) {
            int n = sc.nextInt();
            int[] x = new int [n+1], u = new int[n + 1];
            sinh(n,x,u,1);
        }
    }
}
