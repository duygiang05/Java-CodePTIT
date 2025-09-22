/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class SoDep_1 {
    private static boolean checktn(String s) {
        int l = 0, r = s.length() - 1;
        while(l <= r) {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
    
    private static boolean checkc(String s) {
        String tmp = "02468";
        for(int i = 0 ; i < s.length(); i ++) {
            char x = s.charAt(i);
            if(tmp.indexOf(x) == -1) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t; i++) {
            String n = sc.nextLine();
            if(checkc(n) && checktn(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
