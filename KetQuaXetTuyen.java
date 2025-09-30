/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetQuaXetTuyen;

/**
 *
 * @author PC
 */
import java.util.*;
public class KetQuaXetTuyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i = 0 ;i < n; i++) {
            String a = sc.nextLine(),b = sc.nextLine();  
            double x = Double.parseDouble(sc.nextLine()),y = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(a,b,x,y));
        }
        for(ThiSinh x : list) {
            System.out.println(x);
        }
    }
}

class ThiSinh {
    String ma,hoten,ns,xeploai;
    double lt,th,diemthuong,tong;
    long tb;
    public static int dem = 1,nam = 2021;
    ThiSinh(String a,String b , double x,double y) {
        ma = String.format("PH%02d", dem++);
        hoten = a; ns = b; lt = x; th = y;
        if(lt >=8 && th >=8 ) diemthuong = 1.0;
        else if(lt >= 7.5 && th >= 7.5) diemthuong = 0.5;
        else diemthuong = 0;
        tong = lt + th  ;
        tb = Math.round(tong/2 + diemthuong);
        if(tb > 10) tb = 10;
        if(tb >= 9) xeploai = "Xuat sac" ;
        else if(tb == 8) xeploai = "Gioi";
        else if(tb == 7) xeploai = "Kha";
        else if(tb >= 5) xeploai = "Trung binh";
        else xeploai = "Truot";
    }
    @Override
    public String toString() {
        return ma + " "  +hoten + " "  +(nam - Integer.parseInt(ns.substring(6))) + " "  +tb + " " + xeploai;
    }
}
