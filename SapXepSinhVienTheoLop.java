/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepSinhVienTheoLop;

/**
 *
 * @author PC
 */
import java.util.*;
public class SapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien [] a = new SinhVien[n];
        for(int i = 0 ; i < n; i++) {
            a[i] = new SinhVien();
            a[i].nhap(sc);
        }
        List<SinhVien> list = Arrays.asList(a);
        Collections.sort(list, new sapxep());
        for(int i = 0 ;i < n; i ++) {
            System.out.println(list.get(i));
        }
    }
}
class SinhVien {
    String ma,hoten,email,lop;
    public void nhap(Scanner sc) {
        ma = sc.nextLine();
        hoten = sc.nextLine();
        lop = sc.nextLine();
        email = sc.nextLine();
    }
    @Override
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(ma + " " + hoten + " "  +lop + " " + email);
        return d.toString();
    }
    
}

class sapxep implements Comparator<SinhVien> {
    public int compare (SinhVien a, SinhVien b) {
        if(a.lop.compareTo(b.lop) != 0) return a.lop.compareTo(b.lop);
        return a.ma.compareTo(b.ma);
    } 
}
