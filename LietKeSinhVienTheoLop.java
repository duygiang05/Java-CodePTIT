/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeSinhVienTheoLop;

/**
 *
 * @author PC
 */
import java.util.*;
public class LietKeSinhVienTheoLop {
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
            System.out.println("DANH SACH SINH VIEN LOP " + s +":");
            for(int j = 0; j < t; j ++) {
                if(list.get(j).lop.compareTo(s) == 0) {
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
