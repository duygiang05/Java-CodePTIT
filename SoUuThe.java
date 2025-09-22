/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class SoUuThe {

    private static String check(String s) {
        if (s.charAt(0) == '0') {
            return "INVALID";
        }
        int cntc = 0, cntl = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (!Character.isDigit(x)) {
                return "INVALID";
            }
            if ((x - '0') % 2 == 0) {
                cntc++;
            } else {
                cntl++;
            }
        }
        if ((s.length() % 2 == 0 && cntc > cntl) || (s.length() % 2 == 1 && cntl > cntc)) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
}
