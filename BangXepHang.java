/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangXepHang;

/**
 *
 * @author PC
 */
import java.util.*;
public class BangXepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<SinhVien> list  = new ArrayList<>();
        for(int i = 0 ; i < t; i++) {
            sc.nextLine();
            String s = sc.nextLine();
            int a = sc.nextInt(), b = sc.nextInt();
            list.add(new SinhVien(s,a,b));
        }
        Collections.sort(list, new sapxep());
        for(SinhVien x : list) {
            System.out.println(x);
        }
    }
}
class SinhVien {
    String ten;
    int bai,submit;
    SinhVien(String a, int x, int y) {
        ten = a; bai = x; submit = y;
    }
    @Override
    public String toString() {
        return ten+ " " +bai + " "  +submit;
    }
}
class sapxep implements Comparator<SinhVien> {
    public int compare(SinhVien a, SinhVien b) {
        if(a.bai != b.bai) return b.bai - a.bai;
        else if(a.submit != b.submit) return a.submit - b.submit;
        return a.ten.compareTo(b.ten);
    }
}
