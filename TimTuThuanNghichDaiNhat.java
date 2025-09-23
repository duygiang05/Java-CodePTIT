/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class TimTuThuanNghichDaiNhat {
    private static boolean check(String s) {
        int l = 0, r = s.length() - 1;
        while(l <= r) {
            if(s.charAt(l) != s.charAt(r) ) return false;
            l++; r --;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> mp = new LinkedHashMap<>();
        int maxlen = 0;
        while(sc.hasNext()) {
            String s = sc.next();
            if(check(s)) {
                maxlen = Integer.max(maxlen, s.length());
                mp.put(s,mp.getOrDefault(s,0) + 1);
            }
        }
        for(Map.Entry<String,Integer> tmp : mp.entrySet()) {
            if(tmp.getKey().length() == maxlen) {
                System.out.println(tmp.getKey() + " " + tmp.getValue());
            }
        }
    }
}
