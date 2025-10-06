/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiemTuyenSinh;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class DiemTuyenSinh {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        List<ThiSinh> list = new ArrayList<>();
        for(int i = 0; i < n; i++ ) {
            sc.nextLine();
            String s = sc.nextLine();
            double diem = sc.nextDouble(); 
            sc.nextLine();
            String dantoc = sc.nextLine();
            int khuvuc = sc.nextInt();
            list.add(new ThiSinh(s,dantoc,khuvuc,diem));
        }
        Collections.sort(list, new Comparator<ThiSinh>() {
            public int compare(ThiSinh a, ThiSinh b) {
                if(Double.compare(b.tong, a.tong) != 0) return Double.compare(b.tong, a.tong);
                return a.ma.compareTo(b.ma);
            }
        });
        for(ThiSinh x : list) {
            System.out.println(x);
        }
    }
}
class ThiSinh {
    String ma,hoten="",dantoc,tt;
    int khuvuc;
    double diem,uutien = 0,tong;
    public static int dem = 1;
    ThiSinh(String a,String b,int c,double d) {
        dantoc = b;khuvuc = c; diem = d;
        if(khuvuc == 1) uutien += 1.5;
        else if(khuvuc == 2) uutien += 1;
        
        if(!dantoc.equals("Kinh")) uutien += 1.5;
        String [] tmp = a.trim().split("\\s+");
        for(String x : tmp) {
            hoten += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " " ;
        }
        hoten = hoten.trim();
        ma = String.format("TS%02d", dem++);
        tong = diem + uutien;
        if(tong >= 20.5) tt = "Do";
        else tt = "Truot";
    }
    @Override
    public String toString() {
        return ma + " " + hoten + " "  + String.format("%.1f", tong)+ " " + tt;
    }
}
