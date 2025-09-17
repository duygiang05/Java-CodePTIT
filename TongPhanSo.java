/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class TongPhanSo {
    public static long ucln(long a,long b) {
        if(b == 0 ) return a;
        return ucln(b,a%b);
    }
    
    public static long bcnn(long a,long b) {
        return a * b / ucln(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong(), d = sc.nextLong();
        ps A = new ps(a,b);
        ps B = new ps(c,d);
        A.tong(A, B);
    }
}

class ps {
    long tu,mau;
    
    ps (long a, long b) {
        tu = a; mau = b;
    }
    
    public void tong(ps a, ps b) {
        long tmp = TongPhanSo.bcnn(a.mau, b.mau);
        a.tu *= (tmp / a.mau); b.tu *= (tmp/b.mau);
        long temp = a.tu + b.tu;
        long x = TongPhanSo.ucln(temp, tmp);
        System.out.println( (temp/x) + "/"+ (tmp/x));
    }
}