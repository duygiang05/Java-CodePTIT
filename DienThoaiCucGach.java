/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DienThoaiCucGach {
    
    private static char check(char x) {
        if("abc".indexOf(x) != -1) return '2';
        if("def".indexOf(x) != -1) return '3';
        if("ghi".indexOf(x) != -1) return '4';
        if("jkl".indexOf(x) != -1 ) return '5';
        if("mno".indexOf(x) != -1) return '6';
        if("pqrs".indexOf(x) != -1) return '7';
        if("tvu".indexOf(x) != -1) return '8';
        return '9';
    }
    private static boolean check2(String s ){
        int l = 0, r = s.length() - 1;
        while(l <= r) {
            if(s.charAt(l) != s.charAt(r)) return false;
            l++; r --;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t; i ++) {
            String s = sc.nextLine();
            String ss = s.toLowerCase();
            String ans = "";
            for(int j = 0; j < ss.length(); j ++) {
                char tmp = ss.charAt(j);
                ans += check(tmp);
            }
            if(check2(ans)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
