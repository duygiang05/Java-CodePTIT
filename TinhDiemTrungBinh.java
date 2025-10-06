/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhDiemTrungBinh;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class TinhDiemTrungBinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("BANGDIEM.in"));
        int n = sc.nextInt();
        List<SinhVien> list = new ArrayList<>();
        for(int i = 0;i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            double diem1 = sc.nextDouble(), diem2 = sc.nextDouble(), diem3 = sc.nextDouble();
            list.add(new SinhVien(ten,diem1,diem2,diem3));
        }
        Collections.sort(list, new Comparator<SinhVien>() {
            public int compare(SinhVien a, SinhVien b) {
                if(Double.compare(a.tb, b.tb) != 0) return Double.compare(b.tb,a.tb);
                return a.ma.compareTo(b.ma);
            }
        });
        int rank =1;
        list.get(0).xeploai = 1;
        for(int i = 1; i < list.size();i++) {
            if(Double.compare(list.get(i).tb, list.get(i-1).tb) != 0) {
                rank = i + 1;
            }
            list.get(i).xeploai = rank;
        }
        for(SinhVien x : list) {
            System.out.println(x);
        }
    }
}
class SinhVien {
    String ma,ten="";
    double diem1,diem2,diem3,tb;
    int xeploai;
    public static int dem = 1;
    SinhVien (String a,double b,double c,double d) {
        diem1 = b; diem2 = c; diem3 = d;
        ma = String.format("SV%02d", dem++);
        String[] tmp = a.trim().split("\\s+");
        for(String x : tmp) {
            ten += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        ten = ten.trim();
        tb = (diem1 * 3 + diem2 * 3 + diem3 * 2) / 8;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", tb) +  " " +xeploai;
    }
}
