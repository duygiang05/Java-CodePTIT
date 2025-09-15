/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int tmp = 1;
        boolean check = false;
        for(int i = 0 ;i < n; i ++) a[i] = sc.nextInt();
        for(int x : a) {
            if(x - tmp > 0) {
                check = true;
                for(int j = tmp ; j < x ; j++) {
                    System.out.println(j);
                }
                tmp = x + 1;
            } 
            else tmp++;
        }
        if(!check) System.out.println("Excellent!");
    }
}
