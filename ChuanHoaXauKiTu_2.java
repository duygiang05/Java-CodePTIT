/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class ChuanHoaXauKiTu_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i ++) {
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            for(int j = 1;j < x.length; j ++) {
                String tmp = x[j].toLowerCase();
                char ind = tmp.charAt(0);
                System.out.print(Character.toUpperCase(ind) + tmp.substring(1));
                if(j < x.length - 1) System.out.print(" ");
                else System.out.print(", ");
            }
            System.out.println(x[0].toUpperCase());
//            for(int j = 0 ; j < x.length; j ++) {
//                System.out.println(x[j]);
//            }
        }
    }
}
