/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangKeNhapKhoSapXepTheoChietKhau;

import java.util.*;

/**
 *
 * @author PC
 */
public class BangKeNhapKhoSapXepTheoChietKhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MatHang> list = new ArrayList<>();
        Map<String,Integer> mp = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ;i < n; i++) {
            String s = sc.nextLine();
            long a = Long.parseLong(sc.nextLine()), b = Long.parseLong(sc.nextLine());
            MatHang tmp = new MatHang(s, a, b);
            int tim = mp.getOrDefault(tmp.ma, 0);
            mp.put(tmp.ma, tim + 1);
            tmp.ma += String.format("%02d",tim + 1);
            list.add(tmp);
        }
        Collections.sort(list, new sapxep());
        for(MatHang x : list) {
            System.out.println(x);
        }
    }
}
class MatHang {
    String ten,ma;
    long soluong,dongia,tong,chietkhau;
    MatHang(String a, long x,long y) {
        ten = a; soluong = x; dongia = y;
        tong = soluong * dongia;
        if(soluong > 10) chietkhau = tong * 5 / 100;
        else if(soluong >= 8) chietkhau = tong * 2/ 100 ;
        else if(soluong >= 5) chietkhau = tong / 100;
        else chietkhau = 0;
        String [] tmp = ten.trim().split("\\s+");
        ma = Character.toString(tmp[0].toUpperCase().charAt(0)) + Character.toString(tmp[1].toUpperCase().charAt(0));
        
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + chietkhau + " " + (tong - chietkhau);
    }
}
class sapxep implements Comparator<MatHang> {
    public int compare(MatHang a, MatHang b) {
        return (int)(b.chietkhau - a.chietkhau);
    }
}