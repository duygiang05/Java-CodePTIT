/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XacDinhDanhSachTrungTuyen;

/**
 *
 * @author PC
 */
import java.text.DecimalFormat;
import java.util.*;
public class XacDinhDanhSachTrungTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<ThiSinh> list = new ArrayList<>();
        for(int i = 0 ;i < n; i++) {
            sc.nextLine();
            String s = sc.nextLine(), ss = sc.nextLine();
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            list.add(new ThiSinh(s,ss,a,b,c));
        }
        Collections.sort(list, new Comparator<ThiSinh>() {
            public int compare(ThiSinh a, ThiSinh b) {
                if(a.tong != b.tong) return Double.compare(b.tong, a.tong);
                return a.ma.compareTo(b.ma);
            }
        });
        int chitieu = sc.nextInt();
        double max = 40.1;
        for(ThiSinh x : list) {
            if(chitieu > 0) {
                max = x.tong;
                x.tt = "TRUNG TUYEN";
                chitieu--;
            }
            else {
                if(x.tong == max) {
                    x.tt = "TRUNG TUYEN";
                }
                else x.tt = "TRUOT";
            }
        }
        System.out.println(max);
        for(ThiSinh x : list) {
            System.out.println(x);
        }
    }
}
class ThiSinh{
    String ma,ten,tt;
    double toan,ly,hoa,uutien,tong;
    ThiSinh(String a,String b, double x,double y,double z) {
        ma = a; ten = b;toan = x; ly = y; hoa = z;
        char tmp = ma.charAt(2);
        if(tmp == '1') uutien = 0.5;
        else if(tmp == '2') uutien = 1.0;
        else uutien = 2.5;
        tong = toan * 2 + ly + hoa + uutien;
    }
    @Override
    public String toString() {
        DecimalFormat d = new DecimalFormat("0.#");
        return ma + " " + ten + " "+  d.format(uutien) + " " + d.format(tong) + " " + tt;
    }
}
