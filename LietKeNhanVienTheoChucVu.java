/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeNhanVienTheoChucVu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LietKeNhanVienTheoChucVu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine(), ss = sc.nextLine();
            long a = Long.parseLong(sc.nextLine()), b = Long.parseLong(sc.nextLine());
            list.add(new NhanVien(s, ss, a, b));
        }
        String tmp = sc.nextLine();
        for (NhanVien x : list) {
            if(x.chucvu.compareTo(tmp) == 0) System.out.println(x);
        }
    }
}

class NhanVien {

    public static int dem = 1;
    String hoten, chucvu, ma;
    long luongcb, songaycong, phucap, luong, tamung;

    NhanVien(String a, String b, long x, long y) {
        hoten = a;
        chucvu = b;
        luongcb = x;
        songaycong = y;
        if (chucvu.compareTo("GD") == 0) {
            phucap = 500;
        } else if (chucvu.compareTo("PGD") == 0) {
            phucap = 400;
        } else if (chucvu.compareTo("TP") == 0) {
            phucap = 300;
        } else if (chucvu.compareTo("KT") == 0) {
            phucap = 250;
        } else {
            phucap = 100;
        }
        luong = luongcb * songaycong ;
        ma = String.format("NV%02d", dem++);
        if ((luong+ phucap) * 2.0 / 3 < 25000.0) {
            tamung = Math.round((luong + phucap) * 2.0 / 3 / 1000.0) * 1000;
        } else {
            tamung = 25000;
        }
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + (phucap) + " " + luong + " " + tamung + " " + (luong+ phucap - tamung);
    }
}
