/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangKeTienLuong;

/**
 *
 * @author PC
 */
import java.util.*;
public class BangKeTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<NhanVien> list = new ArrayList<>();
        long ans = 0;
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            long a = (long)Integer.parseInt(sc.nextLine()),b = (long)Integer.parseInt(sc.nextLine());
            String ss = sc.nextLine();
            list.add(new NhanVien(s,ss,a,b));
        }
        for(NhanVien x : list) {
            System.out.println(x);
            ans += x.thuclinh;
        }
        System.out.println("Tong chi phi tien luong: " + ans);
    }
}
class NhanVien{
    String ten,chucvu,ma;
    long  luongngay, songaycong,luongthang,thuong,phucap,thuclinh;
    public static int dem = 1;
    NhanVien(String a,String b, long x,long y) {
        ten = a; chucvu = b; 
        luongngay = x; songaycong = y;
        luongthang = luongngay * songaycong;
        if(songaycong >= 25) {
            thuong = (long)(luongthang * 0.2);
        }
        else if(songaycong >= 22) {
            thuong = (long)(luongthang * 0.1);
        }
        else thuong = 0;
        if(chucvu.compareTo("GD") == 0) phucap = 250000;
        else if(chucvu.compareTo("PGD" )== 0) phucap = 200000;
        else if(chucvu.compareTo("TP") == 0) phucap = 180000;
        else phucap = 150000;
        ma = String.format("NV%02d", dem++);
        thuclinh = luongthang + phucap + thuong;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " +luongthang +" " + thuong+ " " + phucap + " "  +thuclinh;
    }
}
