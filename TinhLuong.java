/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhLuong;

/**
 *
 * @author PC
 */
import java.util.*;
public class TinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> mp = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++) {
            String s = sc.next(), ss = sc.nextLine().trim();
            mp.put(s, ss);
        }
        List<NhanVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n; i++) {
            String ma = sc.nextLine(), ten = sc.nextLine();
            long x = Long.parseLong(sc.nextLine()), y = Long.parseLong(sc.nextLine());
            NhanVien tmp = new NhanVien(ma,ten,x,y);
            String tmp1 = mp.get(ma.substring(3));
            tmp.phongban = tmp1;
            list.add(tmp);
        }
        for(NhanVien x : list) {
            System.out.println(x);
        }
    }
}
class NhanVien {
    String ma,ten,phongban;
    long luongcoban,songaycong,heso,sonam,tong;
    NhanVien (String a, String b, long k,long y) {
        ma = a; ten = b;luongcoban = k; songaycong = y; 
        sonam = Long.parseLong(ma.substring(1,3));
        char x = ma.charAt(0);
        if(sonam >= 16) {
            if(x == 'A') heso = 20;
            else if(x == 'B' ) heso = 16;
            else if(x == 'C') heso = 14;
            else heso = 13;
        }
        else if(sonam >= 9) {
            if(x == 'A') heso = 14;
            else if(x == 'B' ) heso = 13;
            else if(x == 'C') heso = 12;
            else heso = 11;
        }
        else if(sonam >= 4) {
            if(x == 'A') heso = 12;
            else if(x == 'B' ) heso = 11;
            else if(x == 'C') heso = 10;
            else heso = 9;
        }
        else{
            if(x == 'A') heso = 10;
            else if(x == 'B' ) heso = 10;
            else if(x == 'C') heso = 9;
            else heso = 8;
        }
        tong = luongcoban * songaycong * heso * 1000;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + phongban + " "  +tong ; 
    }
}
