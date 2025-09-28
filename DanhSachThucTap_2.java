/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachThucTap_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DanhSachThucTap_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String ma = sc.nextLine(), ten = sc.nextLine(),lop = sc.nextLine(), email = sc.nextLine(), dn = sc.nextLine();
            list.add(new SinhVien(ma,ten,lop,email,dn));
        }
        Collections.sort(list ,new sapxep());
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q; i ++) {
            String s = sc.nextLine();
            for(SinhVien x : list) {
                if(x.dn.compareTo(s) == 0) System.out.println(x);
            }
        }
    }
}

class SinhVien {
    String ma,hoten,lop,email,dn;
    int stt;
    public static int dem = 1;
    SinhVien (String a,String b, String c, String d, String e) {
        this.ma = a; hoten = b; lop = c; email = d;dn = e;
        stt = dem++;
    }
    @Override
    public String toString() {
        return stt + " " + ma + " " + hoten + " " + lop + " " + email + " " + dn ;
    }
}
class sapxep implements Comparator<SinhVien> {
    public int compare(SinhVien a, SinhVien b){
        return a.ma.compareTo(b.ma);
    }
}
