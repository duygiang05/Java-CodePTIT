/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        StringBuilder tmp = new StringBuilder();
        char x = 'a';
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) >= x) {
                x = s.charAt(i);
                tmp.append(s.charAt(i));
            }
        }
        tmp.reverse();
        System.out.println(tmp);
    }
}
