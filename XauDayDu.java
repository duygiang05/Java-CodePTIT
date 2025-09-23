/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t; i ++) {
            sc.nextLine();
            String s = sc.nextLine();
            int k = sc.nextInt();
            Set<Character> st = new HashSet<>();
            for(int j = 0 ; j < s.length();j ++) {
                st.add(s.charAt(j));
            }
//            System.out.println(st.size() + " " + s.length());
            int need = 26 - st.size();
            if(k >= need && s.length() - st.size() >= need) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
