/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachGiangVienTheoBoMon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DanhSachGiangVienTheoBoMon {
    public static String xuli (String s) {
        String tmp = "";
        String[] x = s.trim().split("\\s+");
        for(String i : x) {
            tmp += Character.toString(i.toUpperCase().charAt(0));
        }
        return tmp;
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<GiangVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String bomon = sc.nextLine();
            list.add(new GiangVien(ten,bomon));
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < q; i++) {
            String s = sc.nextLine();
            String tmp = xuli(s);
            System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            for(int j = 0 ;j < n; j++) {
                if(list.get(j).bomon.compareTo(tmp) == 0) {
                    System.out.println(list.get(j));
                }
            }
        }
    }
}
class GiangVien {
    String ma, hoten,bomon = "";
    public static int dem = 1;
    GiangVien(String a,String b )  {
        hoten = a.trim();
        String[] x = b.trim().split("\\s+");
        for(String tmp : x) {
            bomon += Character.toString(tmp.toUpperCase().charAt(0));
        }
        ma = String.format("GV%02d", dem++);
    }
    @Override
    public String toString() {
        return ma + " " + hoten + " " + bomon;
    }
}