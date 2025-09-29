/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhGiaBan_1;

/**
 *
 * @author PC
 */
import java.util.*;
public class TinhGiaBan_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MatHang> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ;i < n; i++) {
            String s = sc.nextLine();
            String ss = sc.nextLine();
            long a = (long) Double.parseDouble(sc.nextLine());
            long b = (long) Double.parseDouble(sc.nextLine());
            list.add(new MatHang(s,ss,a,b));
        }
        for(MatHang x : list) {
            System.out.println(x);
        }
    }
}
class MatHang{
    String ma,ten,dvi;
    long gianhap, soluong,phivc,thanhtien,giaban;
    public static int dem  = 1;
    MatHang (String a,String b, long x, long y) {
        ten = a; dvi = b;
        ma = String.format("MH%02d", dem++);
        gianhap = x; soluong = y;
        phivc  = Math.round((gianhap * soluong) * 0.05 );
        thanhtien = gianhap * soluong + phivc;
        giaban = Math.round(thanhtien * 1.02);  
    } 
    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + phivc + " " + thanhtien + " "  + giaban;
    }
}