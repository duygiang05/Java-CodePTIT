/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XetTuyen;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class XetTuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("XETTUYEN.in"));
        List<NhanVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n; i++) {
            String ten = sc.nextLine(), ngaysinh = sc.nextLine();
            double lt = Double.parseDouble(sc.nextLine()) , th = Double.parseDouble(sc.nextLine());
            list.add(new NhanVien(ten,ngaysinh,lt,th));
        }
        for(NhanVien x : list) {
            System.out.println(x);
        } 
    }
}
class NhanVien{
    String ma,ten ="",ngaysinh,xeploai;
    double lt,th,diemthuong;
    public static int dem = 1;
    long tuoi,tong;
    NhanVien(String a,String b, double x, double y) {
        lt = x; th = y;
        String [] tmp = a.trim().split("\\s+");
        for(String t : tmp) {
            ten += t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase() + " " ;
        }
        ten = ten.trim();
        String [] tmp1 = b.trim().split("/");
        ngaysinh = String.format("%02d/%02d%s", Integer.parseInt(tmp1[0]),Integer.parseInt(tmp1[1]),tmp1[2]);
        if(lt >= 8.0 && th >= 8.0) diemthuong = 1;
        else if(lt >= 7.5 && th >= 7.5) diemthuong = 0.5;
        else diemthuong = 0;
        tong = Math.round((lt + th )/ 2 + diemthuong);
        if(tong > 10) tong = 10;
        if(tong >= 9) xeploai = "Xuat sac";
        else if(tong == 8) xeploai = "Gioi";
        else if(tong == 7) xeploai = "Kha";
        else if(tong >= 5) xeploai = "Trung binh";
        else xeploai = "Truot";
        ma = String.format("PH%02d", dem++);
        tuoi = 2021 - Integer.parseInt(tmp1[2]) ;
    }
    @Override
    public String toString () {
        return ma + " " + ten + " " + tuoi + " " + tong + " " + xeploai;
    }
}
