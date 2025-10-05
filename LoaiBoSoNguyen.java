/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoaiBoSoNguyen;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class LoaiBoSoNguyen {
    public static boolean check(String s) {
        for(int i = 0; i < s.length();i++) {
            if(!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
    public static boolean check1(String s) {
        long ans = 0;
        for(int i = 0;i < s.length();i++) {
            ans = ans * 10 + (s.charAt(i) - '0');
            if(ans > Integer.MAX_VALUE) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> st = new ArrayList<>();
        while(sc.hasNext()) {
            String t = sc.next();
            if(!check(t)) st.add(t);
            else {
                if(!check1(t)) st.add(t);
            }
        }
        Collections.sort(st,new Comparator<String>() {
            public int compare(String a,String b) {
                return a.compareTo(b);
            }
        });
        for(String x : st) {
            System.out.print(x + " ");
        }
    }
}
