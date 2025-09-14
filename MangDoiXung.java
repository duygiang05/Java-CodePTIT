/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class MangDoiXung {
    
    private static boolean check(int[] a,int n) {
        int l = 0, r = n - 1;
        while(l <= r) {
            if(a[l] != a[r]) return false;
            l++; r --;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            if(check(a,n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
