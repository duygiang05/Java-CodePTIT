/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeSinhVienTheoNganh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LietKeSinhVienTheoNganh {
    public static String chuyen(String s) {
        if(s.compareTo("Ke toan") == 0) return "DCKT";
        if(s.compareTo("Cong nghe thong tin") == 0) return "DCCN";
        if(s.compareTo("An toan thong tin") == 0) return "DCAT";
        if(s.compareTo("Vien thong") == 0) return "DCVT";
        return "DCDT";
    }
    
    public static boolean check(String s,char c) {
        if(c == 'E' && s.compareTo("DCCN") == 0) return false;
        if(c == 'E' && s.compareTo("DCAT") == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i = 0 ;i < t; i++) {
            SinhVien tmp = new SinhVien();
            tmp.nhap(sc);
            list.add(tmp);
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q; i++) {
            String s = sc.nextLine();
            String nganh = chuyen(s);
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() +":");
            for(int j = 0; j < t; j ++) {
                if(list.get(j).ma.contains(nganh)) {
                    if(check(nganh,list.get(j).lop.charAt(0))) System.out.println(list.get(j));
                }
            }
        }
    }
}
class SinhVien{
    String ten,ma,lop,email;
    public void nhap(Scanner sc) {
        ma = sc.nextLine();
        ten = sc.nextLine();
        lop = sc.nextLine();
        email = sc.nextLine();
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " +email;
    }
}
