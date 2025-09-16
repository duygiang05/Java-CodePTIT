/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khaibaolopvadoituong;

/**
 *
 * @author PC
 */
import java.util.*;

public class PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        ps A = new ps(a,b);
        A.rutgon();
        A.in();
    }
}

class ps {
    private long a,b;
    
    ps(long x,long y) {
        a = x;
        b = y;
    }
    public long ucln(long a,long b) {
        if(b == 0) return a;
        return ucln(b,a%b);
    }
    
    public void rutgon() {
        long x = ucln(a,b);
        a /= x;
        b /= x;
    }
    public void in() {
        System.out.println(this.a + "/" + this.b);
    }
}