/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeSinhVienTheoKhoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LietKeSinhVienTheoKhoa {
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
            String khoa = s.substring(2);
            System.out.println("DANH SACH SINH VIEN KHOA " + s +":");
            for(int j = 0; j < t; j ++) {
                if(list.get(j).lop.substring(1,3).compareTo(khoa) == 0) {
                    System.out.println(list.get(j));
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