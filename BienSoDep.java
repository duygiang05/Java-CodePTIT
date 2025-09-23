/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class BienSoDep {
    private static boolean check(String s) {
        if(s.charAt(0) == s.charAt(1)&& s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4)) return true;
        return false;
    }
    private static boolean check2(String s) {
        for(int i = 0 ;i < s.length() - 1;i++) {
            if(s.charAt(i) >= s.charAt(i + 1)) return false;
        }
        return true;
    }
    
    private static boolean check4(String s) {
        for(int i = 0 ;i < s.length() - 1; i++) {
            if(s.charAt(i) != s.charAt(i + 1)) return false;
        }
        return true;
    }
    private static boolean check3(String s) {
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) != '8' && s.charAt(i) != '6') return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t; i ++) {
            String s = sc.nextLine();
            String tmp = s.substring(5,8) + s.substring(9);
            if(check(tmp) || check2(tmp) || check3(tmp) || check4(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
