/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XepLoai;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class XepLoai {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        List<SinhVien> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i ++) {
            sc.nextLine();
            String ten = sc.nextLine();
            double diem1 = sc.nextDouble(), diem2 = sc.nextDouble(), diem3 = sc.nextDouble();
            list.add(new SinhVien (ten,diem1,diem2,diem3));
        }
        Collections.sort(list, new Comparator<SinhVien>() {
            public int compare(SinhVien a, SinhVien b) {
                return Double.compare(b.tong,a.tong);
            }
        });
        for(SinhVien x : list) {
            System.out.println(x);
        }
    }
}
class SinhVien {
    String ma,ten="",tt;
    double diem1,diem2,diem3,tong;
    public static int dem = 1;
    SinhVien (String a,double b,double c ,double d) {
        diem1 = b; diem2 = c; diem3 = d;
        tong = diem1 * 0.25 + diem2 * 0.35 + diem3 * 0.4;
        ma = String.format("SV%02d", dem++);
        String [] tmp = a.trim().split("\\s+");
        for(String x : tmp ) {
            ten += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " " ;
        }
        ten = ten.trim();
        if(tong >= 8) tt = "GIOI";
        else if(tong >= 6.5) tt = "KHA";
        else if(tong >= 5) tt = "TRUNG BINH";
        else tt = "KEM";
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", tong) + " " + tt;
    }
}
