/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class TinhToanPhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            pss a = new pss(), b = new pss();
            a.nhap(sc);
            b.nhap(sc);
            pss c = a.pheptinh1(a, b), d = a.pheptinh2(a, b, c);
            System.out.println(c.tu + "/" + c.mau + " " + d.tu + "/" + d.mau)  ;        
        }
    }
}

class pss {

    long tu, mau;

    public void nhap(Scanner sc) {
        this.tu = sc.nextLong();
        this.mau = sc.nextLong();
    }

    public long ucln(long a, long b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    public long bcnn(long a, long b) {
        return a * b / ucln(a, b);
    }

    public void rutgon(pss a) {
        long tmp = ucln(a.tu, a.mau);
        a.tu /= tmp;
        a.mau /= tmp;
    }

    public pss pheptinh1(pss a, pss b) {
        pss c = new pss();
        c.tu = a.tu * b.mau + a.mau * b.tu;
        c.tu *= c.tu;
        c.mau = a.mau * b.mau;
        c.mau *= c.mau;
        rutgon(c);
        return c;
    }
    
    public pss pheptinh2(pss a, pss b, pss c) {
        pss d = new pss();
        d.tu = a.tu * b.tu * c.tu;
        d.mau = a.mau * b.mau * c.mau;
        rutgon(d);
        return d;
    }
}
