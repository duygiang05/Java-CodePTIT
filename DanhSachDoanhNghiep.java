/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachDoanhNghiep;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class DanhSachDoanhNghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String ma = sc.nextLine(), ten = sc.nextLine();
            int sosinhvien = Integer.parseInt(sc.nextLine());
            list.add(new DoanhNghiep(ma,ten,sosinhvien));
        }
        Collections.sort(list, new Comparator<DoanhNghiep>() {
            public int compare(DoanhNghiep a, DoanhNghiep b) {
                return a.ma.compareTo(b.ma);
            }
        });
        for(DoanhNghiep x : list) {
            System.out.println(x);
        }
    }
}
class DoanhNghiep{
    String ma ,ten ;
    int sosinhvien;
    DoanhNghiep(String a, String b, int c) {
        ma = a; ten = b; sosinhvien =c;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + sosinhvien;
    }
}
