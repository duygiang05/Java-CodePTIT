/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TuyenGiaoVien;

/**
 *
 * @author PC
 */
import java.util.*;
public class TuyenGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<GiaoVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ;i < n; i ++) {
            String a = sc.nextLine(), b = sc.nextLine();
            double x = Double.parseDouble(sc.nextLine()) , y = Double.parseDouble(sc.nextLine());
            list.add(new GiaoVien(a,b,x,y));
        }
        Collections.sort(list,new Comparator<GiaoVien>() {
            public int compare(GiaoVien a, GiaoVien b) {
                return Double.compare(b.tong, a.tong);
            }
        });
        for(GiaoVien x : list) {
            System.out.println(x);
        }
    }
}
class GiaoVien{
    String ma,ten,ketqua,stt,mon; 
    double tin,cm,uutien,tong;
    public static int dem = 1;
    GiaoVien(String a, String b,double x,double y){
        ten = a; ma = b;tin = x; cm = y;
        stt = String.format("GV%02d", dem++);
       char tmp = ma.charAt(1);
       if(tmp == '1') uutien = 2.0;
       else if(tmp =='2') uutien = 1.5;
       else if(tmp == '3') uutien = 1.0;
       else uutien = 0.0;
       tong = tin * 2 + cm + uutien;
       if(tong >= 18) ketqua = "TRUNG TUYEN";
       else ketqua = "LOAI";
       char temp = ma.charAt(0);
       if(temp == 'A') mon = "TOAN";
       else if(temp == 'B' ) mon = "LY";
       else mon = "HOA";
    }
    @Override
    public String toString() {
        return stt + " " + ten + " " +mon + " " + String.format("%.1f", tong) + " " + ketqua;
    }
}
