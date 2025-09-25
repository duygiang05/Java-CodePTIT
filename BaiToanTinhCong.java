/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
public class BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nhanvien a = new nhanvien();
        a.nhap(sc);
        a.in();
    }
}

class nhanvien{
    String ma = "NV01", hoten, chucvu;
    long luongcoban, songaycong;
    public long phucap() {
        if("GD".equals(chucvu)) return 250000;
        if("PGD".equals(chucvu)) return 200000;
        if("TP".equals(chucvu)) return 180000;
        return 150000;
    }
    public int tienthuong () {
        if(songaycong >= 25) return 20;
        else if(songaycong >= 22) return 10;
        return 0;
    }
    public void nhap(Scanner sc ) {
        hoten = sc.nextLine();
        luongcoban = sc.nextLong();
        songaycong = sc.nextLong();
        sc.nextLine();
        chucvu = sc.nextLine();
    }
    public void in () {
        long luong = luongcoban * songaycong;
        long thuong = luong * tienthuong() / 100;
        long pc = phucap();
        long thunhap = luong + thuong + pc;
        System.out.println(ma + " " + hoten + " " + luong + " " + thuong +" " + pc + " " + thunhap );
    }
}
