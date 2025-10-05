/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTong;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class TinhTong {
    private static boolean check(String s) {
        long sum = 0;
        for(int  i =0 ; i < s.length();i++) {
            if(!Character.isDigit(s.charAt(i))) return false;
            sum = sum * 10 + (s.charAt(i) - 0);
            if(sum > Integer.MAX_VALUE) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long ans = 0;
        while(sc.hasNext()) {
            String tmp = sc.next();
            if(check(tmp)) {
                int x = Integer.parseInt(tmp);
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
