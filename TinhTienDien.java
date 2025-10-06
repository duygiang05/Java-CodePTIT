/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTienDien;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class TinhTienDien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        List<tiendien> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine(), loai = sc.next();
            long sodau = sc.nextLong(), socuoi = sc.nextLong();
            list.add(new tiendien(ten,loai,sodau,socuoi));
        }
        Collections.sort(list,new Comparator<tiendien>() {
            public int compare(tiendien a,tiendien b) {
                return Long.compare(b.tong, a.tong);
            }
        });
        for(tiendien x : list) {
            System.out.println(x);
        }
    }
}
class tiendien{
    String ma,ten="",loai;
    long sodau,socuoi,vat,vuotmuc,dinhmuc,tong,trongdm;
    public static int dem = 1;
    tiendien(String a,String b, long c,long d) {
        loai = b; sodau = c; socuoi = d;
        if(loai.equals("A")) dinhmuc = 100;
        else if(loai.equals("B")) dinhmuc = 500;
        else dinhmuc = 200;
        long sudung = socuoi - sodau;
        trongdm = sudung * 450;
        vuotmuc = (sudung - dinhmuc ) * 1000 ;
        if(vuotmuc < 0) vuotmuc = 0;
        vat = vuotmuc * 5 / 100;
        tong = trongdm + vuotmuc + vat;
        ma = String.format("KH%02d",dem++);
        String [] tmp = a.trim().split("\\s+");
        for(String x : tmp ) {
            ten += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        ten = ten.trim();
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + trongdm + " "  +vuotmuc + " " + vat +" " +tong; 
    }
}
