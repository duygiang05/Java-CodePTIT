/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int [] a = new int[26];
        for(int i = 0 ; i < s.length();i ++) {
            char x = s.charAt(i);
            a[x-'a'] ++;
        }
        int cnt = 0;
        for(int x : a) {
            if(x > 0) cnt++;
        }
        System.out.println(cnt);
    }
}
