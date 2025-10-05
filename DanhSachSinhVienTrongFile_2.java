/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachSinhVienTrongFile_2;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class DanhSachSinhVienTrongFile_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String ten = sc.nextLine(), lop = sc.nextLine(),ngaysinh = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(ten,lop,ngaysinh,diem));
        }
        for(SinhVien X : list) {
            System.out.println(X);
        }
    }
}
class SinhVien {
    String ma,ten,lop,ngaysinh;
    double diem;
    public static int dem = 1;
    SinhVien(String a,String b,String c,double d) {
        ten = a; lop = b; diem = d;
        ma = String.format("B20DCCN%03d", dem++);
        String [] tmp = c.trim().split("/");
        int x = Integer.parseInt(tmp[0]), y = Integer.parseInt(tmp[1]);
        ngaysinh = String.format("%02d/%02d/%s", x,y,tmp[2]);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ngaysinh + " " + String.format("%.2f", diem);
    }
}
