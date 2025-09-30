/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangLuongTheoPhongBan;

/**
 *
 * @author PC
 */
import java.util.*;
public class BangLuongTheoPhongBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        Map<String,String> mp = new HashMap<>();
//        List<Phongban> list = new ArrayList<>();
        for(int i = 0 ;i < m; i ++) {
            String s = sc.nextLine();
            String t1= s.substring(0,2), t2 = s.substring(3).trim();
            mp.put(t1, t2);
        }
        List<NhanVien> list2 = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ;i < n; i++) {
            String a = sc.nextLine(), b = sc.nextLine();
            long x = Long.parseLong(sc.nextLine()), y = Long.parseLong(sc.nextLine());
            NhanVien tmp = new NhanVien (a,b,x,y);
            String l = mp.get(a.substring(3));
            tmp.tenphong = l;
            list2.add(tmp);
        }
        String s = sc.nextLine();
        System.out.println("Bang luong phong " + mp.get(s) +":");
        for(NhanVien x : list2) {
            if(x.ma.substring(3).equals(s)) System.out.println(x);
        }
    }
}
class NhanVien {
    String ma,ten,tenphong;
    long luongcb,songaycong,heso,luong;
    int t;
    NhanVien (String a, String b, long x, long y ) {
        ma = a; ten = b; luongcb = x; songaycong = y;
        char z = ma.charAt(0); t = Integer.parseInt(ma.substring(1,3));
        if(z == 'A') {
            if(t >= 16) heso = 20;
            else if(t >= 9) heso = 14;
            else if(t >= 4) heso = 12;
            else heso = 10;
        }
        else if(z == 'B') {
            if(t >= 16) heso = 16;
            else if(t >= 9) heso = 13;
            else if(t >= 4) heso = 11;
            else heso = 10;
        }
        else if(z == 'C') {
            if(t >= 16) heso = 14;
            else if(t >= 9) heso = 12;
            else if(t >= 4) heso = 10;
            else heso = 9;
        }
        else {
            if(t >= 16) heso = 13;
            else if(t >= 9) heso = 11;
            else if(t >= 4) heso = 9;
            else heso = 8;
        }
        luong = luongcb * songaycong * heso * 1000;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + luong ;
    }
}
