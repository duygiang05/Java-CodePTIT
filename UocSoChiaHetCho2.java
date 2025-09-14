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


public class UocSoChiaHetCho2 {
    private static int uocso(int a) {
        int cnt = 0;
        int tmp = (int)(Math.sqrt(a));
        for(int i = 1;i <= tmp ; i++) {
            if(a % i == 0) {
                if(i % 2 == 0) cnt++;
                if(a/i != i && (a/i) % 2 == 0) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i = 0;i < t; i++) {
            int a = sc.nextInt();
            System.out.println(uocso(a));
        }
    }
}
