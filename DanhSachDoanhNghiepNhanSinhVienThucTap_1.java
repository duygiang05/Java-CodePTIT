/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoanhNghiepNhanSinhVienThucTap_1;

/**
 *
 * @author PC
 */
import java.util.*;
public class DanhSachDoanhNghiepNhanSinhVienThucTap_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<DoanhNghiep> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ;i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int x = Integer.parseInt(sc.nextLine());
            list.add(new DoanhNghiep(ma,ten,x));
        }
        Collections.sort(list, new sapxep());
        for(DoanhNghiep x : list) {
            System.out.println(x);
        }
    }
}
class DoanhNghiep{
    String ma,ten;
    int soluong;
    DoanhNghiep (String a, String b, int x) {
        ma = a; ten = b; soluong = x;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + soluong;
    }
}
class sapxep implements Comparator<DoanhNghiep> {
    public int compare(DoanhNghiep a, DoanhNghiep b) {
        if(a.soluong != b.soluong) return b.soluong - a.soluong;
        return a.ma.compareTo(b.ma);
    }
}