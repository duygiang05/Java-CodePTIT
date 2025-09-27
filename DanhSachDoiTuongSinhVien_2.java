/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoiTuongSinhVien_2;

/**
 *
 * @author PC
 */
import java.text.DecimalFormat;
import java.time.format.DecimalStyle;
import java.util.*;

public class DanhSachDoiTuongSinhVien_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        SinhVien[] a = new SinhVien[t];
        for (int i = 0; i < t; i++) {
            a[i] = new SinhVien();
            a[i].nhap(sc);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(a[i]);
        }
    }
}

class SinhVien {

    String ma, ten, lop, ngaysinh;
    double gpa;
    public static int dem = 1;

    public void nhap(Scanner sc) {
        ma = String.format("B20DCCN%03d", dem++);
        ten = sc.nextLine();
        lop = sc.nextLine();
        ngaysinh = sc.nextLine();
        gpa = Double.parseDouble(sc.nextLine());
    }

    public void chuanhoaten() {
        String[] tmp = this.ten.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (String x : tmp) {
            ans.append(x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ");
        }
        this.ten = ans.toString().trim();
    }

    public void chuanhoans() {
        char x = this.ngaysinh.charAt(1);
        if(x == '/' ) this.ngaysinh = "0" + this.ngaysinh;
        x = this.ngaysinh.charAt(4);
        if(x == '/') this.ngaysinh = this.ngaysinh.substring(0,3) + "0" + this.ngaysinh.substring(3);
    }

    @Override
    public String toString() {
        this.chuanhoans();
        this.chuanhoaten();
        DecimalFormat d = new DecimalFormat("0.00");
        StringBuilder f = new StringBuilder();
        f.append(ma + " " + ten + " " + lop + " " + ngaysinh + " " + d.format(gpa));
        return f.toString().trim();
    }
}
