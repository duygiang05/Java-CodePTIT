/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.io.*;
import java.util.*;

public class ChuSo4VaChuSo7 {
    private static boolean check(String n) {
        int cnt = 0;
        for(int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if(c == '4' || c == '7') cnt ++;
        }
        return cnt == 4 || cnt == 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if(check(n) ) System.out.println("YES");
        else System.out.println("NO");
    }
}
