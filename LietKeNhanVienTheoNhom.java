/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeNhanVienTheoNhom;

/**
 *
 * @author PC
 */
import java.util.*;
public class LietKeNhanVienTheoNhom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> mp = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        for(int i = 0; i < n; i ++) {
            String tmp = sc.next();
            String tmp1= sc.nextLine();
            NhanVien x = new NhanVien(tmp,tmp1);
            String cv = tmp.substring(0,2);
            int dem = mp.getOrDefault(cv, 0);
            if(cv.equals("GD") && dem >= 1) x.chucvu = "NV";
            if(cv.equals("TP") && dem >= 3) x.chucvu = "NV";
            if(cv.equals("PP") && dem >= 3) x.chucvu = "NV";
            mp.put(cv, dem + 1);
            list.add(x);
        }
        Collections.sort(list, new Comparator<NhanVien>() {
            public int compare(NhanVien a, NhanVien b) {
                if(a.heso != b.heso ) return b.heso - a.heso;
                return a.sohieu - b.sohieu;
            }
        });
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m ;i++) {
            String s = sc.nextLine();
            for(NhanVien y : list) {
                if(y.chucvu.equals(s)) System.out.println(y);
            }
            System.out.println();
        }
//        for(NhanVien x : list) {
//            System.out.println(x);
//        }
    }
}
class NhanVien {
    String ma,ten,chucvu;
    int heso,sohieu;
    NhanVien(String a , String b) {
        ma = a; ten = b;
        chucvu = ma.substring(0,2);
        heso = Integer.parseInt(ma.substring(2,4));
        sohieu = Integer.parseInt(ma.substring(4));
    }
    @Override
    public String toString() {
        return ten.trim() + " " + chucvu + " " + String.format("%03d", sohieu) + " " + String.format("%02d",heso);
    }
}
