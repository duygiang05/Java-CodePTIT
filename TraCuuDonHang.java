/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraCuuDonHang;

/**
 *
 * @author PC
 */
import java.util.*;
public class TraCuuDonHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<donhang> list = new ArrayList<>();
        for(int i = 0;i < n; i ++) {
            String a = sc.nextLine(), b= sc.nextLine();
            long x = Long.parseLong(sc.nextLine()), y = Long.parseLong(sc.nextLine());
            list.add(new donhang(a,b,x,y));
        }
        for(donhang x:list) {
            System.out.println(x);
        }
    }
}
class donhang{
    String ten,ma;
    long dongia ,soluong,giamgia,thanhtien;
    donhang(String a,String b, long x,long y) {
        ten = a; ma = b; dongia = x; soluong = y;
        if(ma.charAt(4) == '1') giamgia = dongia * soluong /2;
        else giamgia = dongia * soluong * 3 / 10;
        thanhtien = dongia * soluong - giamgia;
    }
    @Override
    public String toString() {
        return ten+ " " + ma + " " + ma.substring(1,4) + " "  +giamgia + " " + thanhtien;
    }
}
