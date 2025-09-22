/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class SoDep_2 {
    private static boolean check1(String s) {
        int l = 0, r = s.length() - 1;
        while(l <= r) {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
    
    private static boolean check2(String s) {
        int sum = 0;
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') return false;
        for(int i = 0 ;i < s.length() ;i ++) {
            sum += s.charAt(i) - '0';
        }
        if(sum % 10 != 0) return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i ++) {
            String n = sc.nextLine();
            if(check1(n) && check2(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
