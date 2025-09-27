/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangDiemHocSinh;

/**
 *
 * @author PC
 */
import java.text.DecimalFormat;
import java.util.*;

public class BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HocSinh[] a = new HocSinh[n];
        for(int i = 0 ; i < n ;i ++) {
            a[i] = new HocSinh();
            a[i].nhap(sc);
        }
        List<HocSinh> list = Arrays.asList(a);
        Collections.sort(list, new sapxep());
        for(int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}
class HocSinh{
    public static int dem = 1;
    String ten,xeploai,ma;
    double diemtb;
    double [] x = new double[10];
    public void nhap(Scanner sc) {
        ma = String.format("HS%02d", dem++);
        ten = sc.nextLine().trim();
        String[] tm = sc.nextLine().trim().split("\\s+");
        for(int i = 0 ;i < 10 ; i++) {
            this.x[i] = Double.parseDouble(tm[i]);
         }
        double tmp = 0.0;
        for(int i = 0; i < 10; i++) {
            tmp += x[i];
            if(i == 0 || i == 1) tmp += x[i]; 
        }
        diemtb = Math.round(tmp/12 * 10)/ 10.0;
        if(diemtb >= 9.0) xeploai = "XUAT SAC";
        else if(diemtb >= 8.0) xeploai = "GIOI";
        else if(diemtb >= 7.0) xeploai = "KHA";
        else if(diemtb >= 5.0) xeploai = "TB";
        else xeploai = "YEU";
    }
    @Override
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(ma + " "  +ten + " " + diemtb + " " + xeploai);
        return d.toString().trim();
    }
}
class sapxep implements Comparator<HocSinh> {
    public int compare(HocSinh a, HocSinh b ) {
        if(Double.compare(a.diemtb, b.diemtb) != 0) return Double.compare(b.diemtb, a.diemtb);
        return a.ma.compareTo(b.ma);
    }
}
