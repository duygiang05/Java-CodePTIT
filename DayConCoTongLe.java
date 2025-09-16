/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
public class DayConCoTongLe {
    private static boolean check(Integer[] a, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++ ) sum += a[i];
        return sum % 2 == 1;
    }
    private static void sinh(Integer[] a, Integer[] x,int n,int ind,int j) {
        if(ind >= n) {
            if(check(x,j)) {
                for(int i = 0; i < j ; i++) {
                    System.out.print(x[i] + " ");
                }
                System.out.println();
            }
            return;
        }
        sinh(a,x,n,ind+1,j);
        x[j] = a[ind];
        sinh(a,x,n,ind+1,j+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n], x = new Integer[n];
            for(int j = 0 ;j < n; j++) a[j] = sc.nextInt();
            Arrays.sort(a,0,n,Comparator.reverseOrder());
            sinh(a,x,n,0,0);
        }
    }
}
