/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachSinhVien;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class SapXepDanhSachSinhVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<sv> list = new ArrayList<>();
        for(int i = 0;i < n; i++) {
            String ma = sc.nextLine(),ten = sc.nextLine(), sdt = sc.nextLine(), email = sc.nextLine();
            list.add(new sv(ma,ten,sdt , email));
        }
        Collections.sort(list, new Comparator<sv> () {
            public int compare(sv a,sv b) {
                if(!a.ten.equals(b.ten)) return a.ten.compareTo(b.ten);
                else if(!a.ho.equals(b.ho)) return a.ho.compareTo(b.ho);
                else if(!a.dem.equals(b.dem)) return a.dem.compareTo(b.dem);
                return a.ma.compareTo(b.ma);
            }
        });
        for(sv x : list) {
            System.out.println(x);
        }
    }
}
class sv{
    String ma,ho="",ten="",dem="",sdt,email;
    sv(String a,String b, String c,String d) {
        ma = a; sdt = c; email = d;
        String [] tmp = b.trim().toLowerCase().split("\\s+");
        ho = tmp[0].substring(0,1).toUpperCase() + tmp[0].substring(1);
        ten = tmp[tmp.length - 1].substring(0,1).toUpperCase() + tmp[tmp.length - 1].substring(1);
        for(int i = 1;i < tmp.length - 1;i ++ ) {
            dem += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1) + " ";
        }
        dem = dem.trim();
    }
    @Override
    public String toString() {
        return ma + " " + ho + " " + dem + " " + ten + " " + sdt + " " + email; 
    }
}
