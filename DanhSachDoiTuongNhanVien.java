/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoiTuongNhanVien;

/**
 *
 * @author PC
 */
import java.util.*;

public class DanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien [] a = new NhanVien[n];
        for(int i = 0 ; i < n; i++) {
            a[i] = new NhanVien();
            a[i].nhap(sc);
        }
        for(int i = 0 ; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
class NhanVien {
    String ma,ten,gt,ns,dc,mst,nki;
    public static int dem = 1;
    public void nhap(Scanner sc) {
        ma = String.format("%05d",dem++);
        ten = sc.nextLine();
        gt = sc.nextLine();
        ns = sc.nextLine();
        dc = sc.nextLine();
        mst = sc.nextLine();
        nki = sc.nextLine();
    }
    @Override
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(ma + " " + ten + " " + gt + " " + ns + " " + dc +  " " + mst + " " +nki);
        
        return d.toString().trim();
    }
}
