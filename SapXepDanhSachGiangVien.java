/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachGiangVien;

/**
 *
 * @author PC
 */
import java.util.*;

public class SapXepDanhSachGiangVien {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<GiangVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String bomon = sc.nextLine();
            list.add(new GiangVien(ten,bomon));
        }
        Collections.sort(list, new sapxep());
        for(int i = 0 ;i < n; i ++) {
            System.out.println(list.get(i));
        }
    }
}
class GiangVien {
    String ma, hoten,bomon = "";
    public static int dem = 1;
    GiangVien(String a,String b )  {
        hoten = a.trim();
        String[] x = b.trim().split("\\s+");
        for(String tmp : x) {
            bomon += Character.toString(tmp.toUpperCase().charAt(0));
        }
        ma = String.format("GV%02d", dem++);
    }
    @Override
    public String toString() {
        return ma + " " + hoten + " " + bomon;
    }
}
class sapxep implements Comparator<GiangVien> {
    public int compare(GiangVien a, GiangVien b) {
        int i = a.hoten.lastIndexOf(" ");
        int j = b.hoten.lastIndexOf(" ");
        String tena = a.hoten.substring(i + 1), tenb = b.hoten.substring(j + 1);
        if(tena.compareTo(tenb) != 0) return tena.compareTo(tenb);
        return a.ma.compareTo(b.ma);
    }
}