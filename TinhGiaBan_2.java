/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhGiaBan_2;

/**
 *
 * @author PC
 */
import java.util.*;
public class TinhGiaBan_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        for(int i = 0 ; i < n; i++) {
            String s = sc.nextLine(), ss = sc.nextLine();
            long a = (long)Double.parseDouble(sc.nextLine()),b = (long)Double.parseDouble(sc.nextLine());
            list.add(new MatHang(s,ss,a,b));
        }
        Collections.sort(list, new sapxep());
        for(MatHang x : list) {
            System.out.println(x);
        }
    }
}
class MatHang{
    String ma,ten,dvi;
    long gianhap,soluong,phivc,thanhtien,giaban;
    public static int dem = 1;
    MatHang(String s,String ss,long a, long b) {
        ten = s; dvi = ss;
        gianhap = a; soluong = b;
        ma = String.format("MH%02d", dem++);
        phivc = Math.round((gianhap * soluong) * 0.05);
        thanhtien = gianhap * soluong + phivc;
        giaban = (long)Math.ceil(thanhtien * 1.02 / soluong / 100 ) * 100;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + phivc + " "  + thanhtien + " " + giaban ;
    }
}
class sapxep implements Comparator<MatHang> {
    public int compare(MatHang a, MatHang b) {
        return (int)(b.giaban - a.giaban);
    }
}