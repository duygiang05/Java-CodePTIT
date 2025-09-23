/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class MaHoaDRM {

    private static String divide(String a, String mau) {
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            sum += a.charAt(i) - 'A';
        }
        String tmp = "";
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            int x1 = (x - 'A' + sum) % 26;
            tmp += mau.charAt(x1);
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            String a = s.substring(0, s.length() / 2);
            String b = s.substring(s.length() / 2);
            String mau = "", ans = "";
            for (char x = 'A'; x <= 'Z'; x++) {
                mau += Character.toString(x);
            }
            a = divide(a, mau);
            b = divide(b, mau);
//            System.out.println(a + " " + b);
            for(int j = 0 ;j < s.length()/2;j ++) {
                int indx = mau.indexOf(b.charAt(j));
                int index = (a.charAt(j) - 'A' + indx )% 26;
                ans += mau.charAt(index);
            }
            System.out.println(ans);
        }
    }
}
