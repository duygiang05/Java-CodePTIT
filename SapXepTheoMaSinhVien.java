/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepTheoMaSinhVien;

/**
 *
 * @author PC
 */
import java.util.*;
public class SapXepTheoMaSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<SinhVien> list = new ArrayList<>();
        while(sc.hasNextLine()) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new SinhVien(ma,ten,lop,email));
        }
        Collections.sort(list, new sapxep());
        for(SinhVien x : list) {
            System.out.println(x);
        }
    }
}

class SinhVien {
    String ten,ma,lop,email;
    SinhVien (String a,String b, String c, String d) {
        this.ma = a;
        this.ten = b;
        this.lop = c; 
        this.email = d;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " "  +lop + " " + email;
    }
}

class sapxep implements Comparator<SinhVien> {
    public int compare(SinhVien a, SinhVien b) {
        return a.ma.compareTo(b.ma);
    } 
}