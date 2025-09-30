/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiemDanh_2;

/**
 *
 * @author PC
 */
import java.util.*;
public class DiemDanh_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        
        for(int i = 0; i < n; i ++) {
            String a = sc.nextLine(), b= sc.nextLine(), c= sc.nextLine();
            list.add(new SinhVien(a,b,c));
        }
        
        for(int i = 0; i < n; i++) {
            String a = sc.next(), b = sc.next();
            for(SinhVien x : list) {
                if(x.ma.equals(a)) {
                    for(int j = 0; j < b.length();j ++) {
                        char z = b.charAt(j);
                        if(z == 'm') x.diem --;
                        else if(z == 'v') x.diem -= 2;
                    }
                    if(x.diem < 0) x.diem = 0;
                    if(x.diem == 0) x.tt = "KDDK";
                    break;
                }
            }
        }
        String s = sc.next();
        for(SinhVien x : list) {
            if(x.lop.equals(s)) System.out.println(x);
        }
    }
}
class SinhVien{
    String ma,hoten,lop,tt = "";
    int diem = 10;
    SinhVien(String a,String b,String c) {
        ma = a; hoten = b; lop = c;
    }
    @Override
    public String toString() {
        return ma + " " + hoten + " " + lop + " "  +diem + " " + tt;
    }
}
