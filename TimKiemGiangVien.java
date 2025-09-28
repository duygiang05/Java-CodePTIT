/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimKiemGiangVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */

public class TimKiemGiangVien {
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
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(int j = 0 ;j < n; j++) {
                if(list.get(j).hoten.toLowerCase().contains(s.toLowerCase())) {
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
