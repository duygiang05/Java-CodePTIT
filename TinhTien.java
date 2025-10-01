/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTien;

/**
 *
 * @author PC
 */
import java.util.*;
public class TinhTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MatHang> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String ma = sc.next();
            sc.nextLine();String ten = sc.nextLine();
            long a = sc.nextLong(), b= sc.nextLong(), c = sc.nextLong();
            list.add(new MatHang(ma,ten,a,b,c));
        }
        Collections.sort(list, new Comparator<MatHang>() {
            public int compare(MatHang a, MatHang b) {
                return Long.compare(b.tong, a.tong);
            }
        });
        for(MatHang x : list) {
            System.out.println(x);
        }
    }
}
class MatHang {
    String ma ,ten;
    long soluong,gia,chietkhau,tong;
    MatHang(String a, String b, long c, long d, long e){
        ma = a;ten = b; soluong  = c; gia = d;chietkhau = e;
        tong = soluong  * gia - chietkhau;
    }
    @Override
    public String toString () {
        return ma + " " + ten +  " " + soluong + " " + gia + " " + chietkhau + " " + tong;
    }
}
