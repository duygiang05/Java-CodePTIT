/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangDIemTuyenSinh;

/**
 *
 * @author PC
 */
import java.text.DecimalFormat;
import java.util.*;
public class BangDiemTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i = 0;i < n; i++) {
            String ma = sc.nextLine(), hoten = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine()), ly = Double.parseDouble(sc.nextLine()),hoa = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(ma,hoten,toan,ly,hoa));
        }
        for(ThiSinh x : list) {
            System.out.println(x);
        }
    }
}
class ThiSinh{
    String ma,hoten,trangthai;
    double toan,ly,hoa,tong,uutien;
    ThiSinh(String a , String b, double x,double y,double z) {
        ma = a; hoten = b;toan = x; ly = y;hoa = z;
        tong = (toan * 2 + ly +hoa) ;
        if(ma.charAt(2) == '1') uutien = 0.5;
        else if(ma.charAt(2) == '2') uutien = 1.0;
        else uutien = 2.5;
        if(tong  + uutien < 24) trangthai = "TRUOT";
        else trangthai = "TRUNG TUYEN";
    }
    @Override
    public String toString() {
        DecimalFormat d = new DecimalFormat("0.#");
        return ma + " " + hoten + " " + d.format(uutien) + " "  + d.format(tong) + " "  +trangthai;
    }
}
