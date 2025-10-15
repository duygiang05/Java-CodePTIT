/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachThucTap_3;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;

public class DanhSachThucTap_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i = 0;i < n; i++) {
            String ma = sc.nextLine(), ten = sc.nextLine(), lop = sc.nextLine(), email = sc.nextLine();
            list.add(new SinhVien(ma,ten,lop,email));
        }
        Collections.sort(list,new Comparator<SinhVien>() {
            public int compare(SinhVien a, SinhVien b) {
                return a.ma.compareTo(b.ma);
            }
        });
        
        sc.close();
        sc = new Scanner(new File("DN.in"));
        Map<String,dn> mp = new HashMap<>();
        int m = sc.nextInt();
        for(int i = 0;i < m; i++ ) {
            sc.nextLine();
            String ma = sc.nextLine(), ten = sc.nextLine();
            int soluong = sc.nextInt();
            mp.put(ma, new dn(ten,soluong));
        }
        sc.close();
        sc = new Scanner(new File("THUCTAP.in"));
        int q = sc.nextInt();
        Map<String,String> mp1 = new TreeMap<>();
        for(int i = 0;i < q;i ++) {
            String ma = sc.next(), ten = sc.next();
            mp1.put(ma, ten);
        }
        mp1.forEach((a,b)->{
            dn tmp = mp.get(b);
            if(tmp.soluong > 0) {
                tmp.soluong -= 1;
                for(SinhVien x : list) {
                    if(x.ma.equals(a)) {
                        x.doanhnghiep = b;
                    }
                }
            }
        });
        
        int tv = sc.nextInt();
        for(int i = 0; i < tv; i++) {
            String tmp = sc.next();
//            System.out.println(tmp);
            System.out.println("DANH SACH THUC TAP TAI " + mp.get(tmp).ten + ":");
            for(SinhVien x : list) {
                if(x.doanhnghiep.equals(tmp)) {
                    System.out.println(x);
                }
            }
        }
//        for(SinhVien x : list) {
//            System.out.println(x);
//        }
//        mp.forEach((a,b)->{
//            System.out.println(a + " " + b);
//        });
    }
}


class SinhVien{
    String ma, ten="", lop , email,doanhnghiep="";
    SinhVien(String a,String b, String c, String d) {
        ma = a;lop = c; email = d;
        String [] tmp = b.trim().split("\\s+");
        for(String x : tmp) {
            ten += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        ten = ten.trim();
    }
    @Override
    public String toString () {
        return ma + " " + ten + " " + lop ;
    }
}


class dn {
    String ten;
    int soluong;
    dn (String b,int c) {
        ten = b; soluong = c;
    }
    @Override
    public String toString() {
        return ten + " " + soluong;
    }
}
