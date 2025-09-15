/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class SapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n ;i ++) {
            int tmp = a[i]; 
            int j = i - 1;
            while(j >=0 && a[j] > tmp) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = tmp;
            System.out.print("Buoc " + i + ": ");
            for(int k = 0 ; k <= i ;k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
