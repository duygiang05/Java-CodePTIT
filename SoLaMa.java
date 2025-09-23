/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class SoLaMa {
    private static int check(char x) {
        if(x == 'I') return 1;
        if(x == 'V' ) return 5;
        if(x == 'X') return 10;
        if(x == 'L') return 50;
        if(x == 'C') return 100;
        if(x == 'D') return 500;
        return 1000;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t;i ++) {
            String s = sc.nextLine();
            int maxn = 0;
            for(int j = 0 ; j < s.length();j ++) {
                maxn = Integer.max(maxn, check(s.charAt(j)));
            }
            int ans = 0, tmp = 0;
            for(int j = 0; j < s.length(); j ++) {
                int x = check(s.charAt(j));
                if(tmp == 0) {
                    if(x == maxn) ans += x;
                    else tmp = x;
                }
                else {
                    if(x > tmp) {
                        ans += x - tmp;
                        tmp = 0;
                    }
                    else {
                        ans += tmp;
                        tmp = x;
                    }
                }
            }
            if(tmp > 0) ans += tmp;
            System.out.println(ans);
        }
    }
}
