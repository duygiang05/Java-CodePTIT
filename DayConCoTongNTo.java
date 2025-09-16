/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
import java.lang.*;

public class DayConCoTongNTo {
    private static boolean nto(int n) {
        for(int i = 2; i <= (int)Math.sqrt(n) ;i++) {
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    private static boolean check(Integer [] x, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += x[i];
        } 
        return nto(sum);
    }
    
    private static void sinh(Integer[] a, Integer [] x, int ind, int n, int j) {
        if(ind >= n) {
            if(check(x,j)) {
                for(int i = 0 ;i < j ; i++) {
                    System.out.print(x[i] + " ");
                }
                System.out.println();
            }
            return;
        }
        sinh(a,x,ind+1,n,j);
        x[j] = a[ind];
        sinh(a,x,ind+1,n,j+1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n], x = new Integer[n];
            for(int  j = 0 ;j < n; j++) a[j] = sc.nextInt();
            Arrays.sort(a,0,n,Comparator.reverseOrder());
//            for(int j = 0 ; j < n; j ++){
//                System.out.print(a[j] + " ");
//            }
            sinh(a,x,0,n,0);
        }
    }
}
