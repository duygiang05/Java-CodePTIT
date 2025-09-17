/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine();
        double x = sc.nextDouble();
        sinhvien A = new sinhvien(a,b,c,x);
        A.setns();
        A.in();
    }
}
class sinhvien{
    String hoten, lop, ngaysinh;
    double diem;
    sinhvien() {}
    
    sinhvien(String a,String b, String c, double x) {
        hoten = a; lop = b; ngaysinh = c; diem = x;
    }
    public void setns() {
        String s = this.ngaysinh;
        char x = this.ngaysinh.charAt(2);
        if(x != '/') {
            s = "0" + this.ngaysinh;
        }
        char y = s.charAt(5);
        if(y != '/') {
            s = s.substring(0, 3) + "0" + s.substring(3);  
        }
        this.ngaysinh = s;
    }
    public void in() {
        System.out.printf("B20DCCN001 %s %s %s %.2f" , this.hoten , this.lop , this.ngaysinh ,diem );
    }
}