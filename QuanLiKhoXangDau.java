/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLiKhoXangDau;

/**
 *
 * @author PC
 */
import java.util.*;
public class QuanLiKhoXangDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<XangDau> list = new ArrayList<>();
        for(int i = 0 ;i < n; i++) {
            String ma = sc.next();
            long soluong = Long.parseLong(sc.next());
            list.add(new XangDau(ma,soluong));
        }
        for(XangDau x : list) {
            System.out.println(x);
        }
    }
}
class XangDau{
    String ma,ten;
    long soluong,dongia,thue,ptthue;
    XangDau(String s, long a) {
        ma = s; soluong = a;
        char x = ma.charAt(0);
        String tmp = ma.substring(3);
        if(tmp.equals("BP")) ten = "British Petro";
        else if(tmp.equals("ES")) ten = "Esso";
        else if(tmp.equals("SH")) ten = "Shell";
        else if(tmp.equals("CA") ) ten = "Castrol";
        else if(tmp.equals("MO")) ten = "Mobil";
        else ten = "Trong Nuoc";
        if(x == 'X') {
            dongia = 128000;
            ptthue = 30;
        }
        else if(x == 'D') {
            dongia = 11200;
            ptthue = 35;
        }
        else{
            dongia = 9700;
            ptthue = 20;
        }
        if(tmp.equals("TN")) ptthue = 0;
        thue = soluong * dongia * ptthue / 1000;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " +dongia + " " + thue + " " + (soluong * dongia + thue);
    }
}
