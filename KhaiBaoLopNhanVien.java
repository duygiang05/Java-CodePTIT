/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        nv a = new nv();
        a.nhap();
        a.in();
    }
}
class nv{
    Scanner sc = new Scanner (System.in);
    String ten,gt,ns,dc,mst,nki;
    nv() {}
    public void nhap() {
        this.ten = sc.nextLine();
        this.gt = sc.nextLine();
        this.ns = sc.nextLine();
        this.dc = sc.nextLine();
        this.mst = sc.nextLine();
        this.nki = sc.nextLine();
    }
    
    public void in () {
        System.out.println("00001 " + ten + " "  + gt + " " + ns + " " + dc + " " + mst + " " + nki);
    }
}