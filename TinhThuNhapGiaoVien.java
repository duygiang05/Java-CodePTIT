/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gv a = new gv();
        a.nhap(sc);
        System.out.println(a.ma +" " + a.ten +" "+ a.heso()+" " + a.phucap() + " " + a.luong());
    }
}

class gv {
    String ma,ten;
    long luongcoban;
    
    public void nhap(Scanner sc) {
        ma = sc.nextLine();
        ten = sc.nextLine();
        luongcoban = sc.nextLong();
    }
    
    public long phucap() {
        String tmp = this.ma.substring(0, 2);
        if("HT".equals(tmp)) return 2000000;
        if("HP".equals(tmp)) return 900000;
        return 500000;
    }
    
    public int heso() {
        String tmp = this.ma.substring(2);
        int hs = Integer.parseInt(tmp);
        return hs;
    }
    
    public long luong() {
        return this.luongcoban * heso() + phucap();
    }
}