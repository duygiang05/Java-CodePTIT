/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuanHoaDanhSachSinhVien;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class ChuanHoaDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        List<SinhVien> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i < n; i++) {
            sc.nextLine();
            String a = sc.nextLine(), b= sc.nextLine(), c = sc.nextLine();
            double d = sc.nextDouble();
            list.add(new SinhVien(a,b,c,d));
        }
        for(SinhVien x : list) {
            System.out.println(x);
        }
    }
}
class SinhVien {
    String ten="",lop,ngaysinh,ma;
    double diem;
    public static int dem = 1;
    SinhVien(String a,String b, String c,double d) {
        lop = b; diem = d;
        String [] tmp = a.trim().split("\\s+");
        for(String x : tmp) {
            ten += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        ten = ten.trim();
        String [] temp = c.trim().split("/");
        ngaysinh = String.format("%02d/%02d/%s", Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),temp[2]);
        ma = String.format("B20DCCN%03d", dem++);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ngaysinh + " " + String.format("%.2f", diem);
    }
}