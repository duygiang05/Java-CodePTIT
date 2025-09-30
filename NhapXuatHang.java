/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhapXuatHang;

/**
 *
 * @author PC
 */
import java.util.*;
public class NhapXuatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MatHang> list = new ArrayList<>();
        List<NhapHang> list1 = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine();
            list.add(new MatHang(a,b,c));
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            String a = sc.next();
            long x = sc.nextLong(), y = sc.nextLong(), z = sc.nextLong();
            NhapHang tmp = new NhapHang(a);
            tmp.nhap = x * y; tmp.xuat = y * z;
            for(MatHang temp : list) {
                if(a.equals(temp.ma)) {
                    tmp.ten = temp.ten;
                    if(temp.xeploai.equals("A")) {
                        tmp.xuat = tmp.xuat * 108 / 100;
                    }
                    else if(temp.xeploai.equals("B")) tmp.xuat = tmp.xuat * 105 / 100;
                    else tmp.xuat = tmp.xuat * 102 / 100;
                }
            }
            list1.add(tmp);
        }
        for(NhapHang x : list1) {
            System.out.println(x);
        }
    }
}
class MatHang{
    String ma,ten,xeploai;
    MatHang(String a, String b,String c) {
        ma = a; ten = b; xeploai = c;
    }
}
class NhapHang {
    String ma,ten;
    long nhap,xuat;
    NhapHang(String x) {
        ma = x;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + nhap + " " + xuat;
    }
}
