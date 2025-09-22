/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class ChuanHoaXauKiTu_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t; i ++) {
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
//            for(String k : x) {
//                System.out.println(k + " ");
//            }
            for(String it : x) {
                String tmp = it.toLowerCase();
                char st = tmp.charAt(0);
                System.out.print(Character.toUpperCase(st) + tmp.substring(1) + " ");
            }
            System.out.println();
        }
    }
}
