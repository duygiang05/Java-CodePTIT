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
public class SoLienKe {
    
    private static boolean check(String n) {
        for(int i = 1 ;i < n.length();i ++) {
            int c = (int)n.charAt(i);
            int d = (int)n.charAt(i - 1), tmp = c - d;
            if(Math.abs(tmp) != 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t;i ++) {   
            String n = sc.nextLine();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
