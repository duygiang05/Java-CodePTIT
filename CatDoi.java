/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class CatDoi {
    private static String catdoi(String s) {
        boolean check = false; 
        String ans = "";
        for (char x : s.toCharArray()) {
            if (x == '0') ans += '0';
            else if(x == '8') ans += '0';
            else if(x == '1') {ans += '1'; check = true;}
            else if (x == '9') ans += '0';
            else return "INVALID";
        }
        if (!check) return "INVALID";
        int i = 0;
        while(i < ans.length() && ans.charAt(i) == '0' ) i++;
        return ans.substring(i);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0;i < t; i++) {
            String s = sc.nextLine();
            System.out.println(catdoi(s));
        }
    }
}
