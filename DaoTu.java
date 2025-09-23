/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DaoTu {
    private static String daotu(String s) {
        String b = "" ;
        for(int i = s.length() - 1;i >= 0; i--) {
            char x = s.charAt(i);
            b += x;
        }
        return b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i ++) {
            String s = sc.nextLine();
            String [] x = s.trim().split(" ");
            for(String it : x) {
                System.out.print(daotu(it) + " ");
            }
            System.out.println();
        }
    }
}
