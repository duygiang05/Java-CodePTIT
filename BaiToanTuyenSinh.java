/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.text.DecimalFormat;
import java.util.*;

public class BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ts a = new ts();
        a.nhap(sc);
        a.in();
//        System.out.println("HELLO WORLD!!!!");
    }
}
class ts {
    String ma,hoten;
    double toan,ly,hoa;
    public double diemuutien() {
        String tmp = ma.substring(0, 3);
        if("KV1".equals(tmp)) return 0.5;
        if("KV2".equals(tmp)) return 1.0;
        return 2.5;
    }
    public double tongdiem() {
        return toan * 2 + ly + hoa;
    }
    public String trangthai() {
        double tmp = tongdiem() + diemuutien();
        if(tmp >= 24.0) return ("TRUNG TUYEN");
        return ("TRUOT");
    }
    public void nhap(Scanner sc) {
        ma = sc.nextLine();
        hoten = sc.nextLine();
        toan = sc.nextDouble(); ly = sc.nextDouble(); hoa = sc.nextDouble();
    }
    public void check(double s) {
        int x = (int)s;
        if(s - x * 1.0 > 0) System.out.print(s);
        else System.out.print(x);
    }
    public void in () {
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.println(ma + " " + hoten + " " + df.format(diemuutien()) + " " + df.format(tongdiem()) + " " + trangthai());
    }
}