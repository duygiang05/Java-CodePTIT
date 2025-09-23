/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t; i ++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.compareTo(b) == 0) System.out.println("-1");
            else System.out.println(Integer.max(a.length(), b.length()));
        }
    }
}
