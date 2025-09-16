/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DayConCoKPhanTuTangDan {
    private static void sinh(int[] a, int[] x ,int n,int k , int ind) {
        if(ind > k) {
            for(int i = 1 ; i <= k ; i++) {
                System.out.print(a[x[i]] + " ");
            }
            System.out.println(); return;
        }
        for(int j = x[ind-1] + 1; j <= n - k + ind ; j++  ) {
            x[ind] = j;
            sinh(a,x,n,k,ind+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i ++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n + 1], x = new int[n + 1];
            for(int j = 1;j <= n ;j ++) a[j] = sc.nextInt();
            Arrays.sort(a);
            sinh(a,x,n,k,1);
        }
    }
}
