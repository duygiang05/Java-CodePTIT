/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangTheoDoiNhapXuatHang;

/**
 *
 * @author PC
 */
import java.util.*;
public class BangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            long a = Long.parseLong(sc.nextLine());
            list.add(new MatHang(s,a));
        }
        for(MatHang x : list) {
            System.out.println(x);
        }
    }
}
class MatHang{
    String ma;
    long nhap,xuat,dongia,tien,thue;
    MatHang(String a, long b) {
        ma = a; nhap = b;
        if(ma.charAt(0) == 'A') xuat = Math.round(nhap * 0.6);
        else xuat = Math.round(nhap * 0.7);
        if(ma.charAt(4) == 'Y') dongia = 110000;
        else dongia = 135000;
        tien = xuat * dongia;
        
        if(ma.charAt(0) == 'A' && ma.charAt(4) == 'Y') thue = (Math.round(tien * 0.08));
        else if(ma.charAt(0) == 'A' && ma.charAt(4) == 'N') thue = (Math.round(tien * 0.11));
        else if(ma.charAt(0) == 'B' && ma.charAt(4) == 'Y') thue = (Math.round(tien * 0.17));
        else thue = (Math.round(tien * 0.22));
    }
    @Override
    public String toString() {
        return ma + " " + nhap + " " + xuat + " "  +dongia +" "  +tien + " " + thue;
    }
}
