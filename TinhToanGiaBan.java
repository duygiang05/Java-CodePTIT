/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanGiaBan;

/**
 *
 * @author PC
 */
import java.util.*;
public class TinhToanGiaBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Donhang> list = new ArrayList<>();
        for(int i = 0;i < n; i++) {
            String a = sc.next(); double gia = sc.nextDouble(), soluong = sc.nextDouble();
            list.add(new Donhang (a,gia,soluong));
        }
        for(Donhang x : list) {
            System.out.println(x);
        }
    }
}
class Donhang{
    String ma;
    double dongia,soluong,thue,phivc,tong;
    Donhang(String a,double b,double c) {
        ma = a; dongia = b; soluong = c;
        char x = ma.charAt(0);
        if(x == 'T'){
            thue = 0.29; phivc = 0.04;
        }
        else if(x == 'C') {
            thue = 0.1; phivc = 0.03;
        }
        else if(x == 'D') {
            thue = 0.08; phivc = 0.025;
        }
        else {
            thue = 0.02; phivc = 0.005;
        }
        if(ma.charAt(ma.length()-1) == 'C') thue = thue * 0.95;
        tong = (1.0 + thue + phivc ) * dongia * soluong * 1.2 / soluong;
    }
    @Override
    public String toString() {
        return ma + " " + String.format("%.2f", tong);
    }
}
