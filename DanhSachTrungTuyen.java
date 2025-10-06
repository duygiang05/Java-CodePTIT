/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachTrungTuyen;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class DanhSachTrungTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        List<thisinh> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ;i < n; i++) {
            String ma = sc.nextLine(), ten = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine()), ly = Double.parseDouble(sc.nextLine()), hoa = Double.parseDouble(sc.nextLine());
            list.add(new thisinh(ma,ten,toan,ly,hoa));
        }
        int chitieu = sc.nextInt();
        Collections.sort(list, new Comparator<thisinh>() {
            public int compare(thisinh a, thisinh b) {
                if(Double.compare(b.tong,a.tong) != 0) return Double.compare(b.tong, a.tong);
                return a.ma.compareTo(b.ma);
            }
        });
        double max = 0;
        for(thisinh x : list) {
            if(chitieu > 0) {
                x.tt = "TRUNG TUYEN";
                max = x.tong;
                chitieu--;
            }
            else {
                if(Double.compare(max,x.tong) == 0) x.tt = "TRUNG TUYEN";
                else x.tt = "TRUOT";
            }
        }
        System.out.println(String.format("%.1f", max));
        for(thisinh x : list) {
            System.out.println(x);
        }
    }
}
class thisinh{
    String ma , ten ="",tt;
    double uutien,tong,toan,ly,hoa;
    thisinh(String a,String b, double c,double d,double e) {
        ma = a;
        toan = c; ly = d; hoa = e;
        String tmp = ma.substring(0,3);
        if(tmp.equals("KV1")) uutien = 0.5;
        else if(tmp.equals("KV2")) uutien = 1.0;
        else uutien = 2.5;
        String [] temp = b.trim().split("\\s+");
        for(String x : temp) {
            ten += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        ten = ten.trim();
        tong = toan * 2 + ly + hoa + uutien;
    }
    @Override
    public String toString () {
        DecimalFormat d = new DecimalFormat("0.#");
        return ma + " " + ten + " " + d.format(uutien) + " " + d.format(tong) + " " + tt;
    }
}
