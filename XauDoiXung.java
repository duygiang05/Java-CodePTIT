/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
public class XauDoiXung {
    private static String check(String s) {
        int cnt = 0;
        int l = 0, r = s.length() - 1;
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) cnt ++;
            l++;  r--;
        }
        if(s.length() % 2 == 0) {
            if(cnt == 0) return "NO";
            else if(cnt == 1) return "YES";
            else return "NO";
        }
        else  {
            if(cnt <= 1) return "YES";
        }
        return "NO";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t; i ++) {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
}
