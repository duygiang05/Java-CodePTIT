/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XepHangVanDongVien_2;

/**
 *
 * @author PC
 */
import java.util.*;
public class XepHangVanDongVien_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<VanDongVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine(),a = sc.nextLine(), b =sc.nextLine(), c =sc.nextLine();
            list.add(new VanDongVien(s,a,b,c));
        }
        List<VanDongVien> tmp = new ArrayList<>(list);
        Collections.sort(tmp, (a,b) ->a.getgiay() - b.getgiay());
        int rank = 1;
        for(int i = 0;i < n; i ++) {
            if(i > 0 && tmp.get(i).getgiay() > tmp.get(i-1).getgiay()){
                rank = i + 1;
            }
            tmp.get(i).thuhang = rank;
        }
        for(VanDongVien x : tmp) {
            System.out.println(x);
        }
    }
}
class VanDongVien{
    String ma,ten,ns,xp,vd,thanhtich,uutien,tong;
    int thuhang,tuoi;
    public static int dem = 1,nam = 2021;
    VanDongVien(String a,String b, String c, String d) {
        ma = String.format("VDV%02d", dem++);
        ten = a; ns = b; xp = c; vd = d;
        tuoi = nam - Integer.parseInt(ns.substring(6));
        if(tuoi < 18 ) uutien = "00:00:00";
        else if(tuoi <= 25) uutien = "00:00:01";
        else if(tuoi <= 32) uutien = "00:00:02";
        else uutien = "00:00:03";
        thanhtich = tru(xp,vd);
        tong = tru(uutien,thanhtich);
    }
    public String tru(String a,String b) {
        String [] s1 = a.trim().split(":");
        String [] s2 = b.trim().split(":");
        int nho = 0;
        int giay = Integer.parseInt(s2[2]) - Integer.parseInt(s1[2]);
        if(giay < 0) {
            giay += 60; nho = 1;
        }
        int phut = Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]) - nho; nho = 0;
        if(phut < 0) {
            nho = 1; phut += 60;
        }
        int gio = Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]) - nho;
        return String.format("%02d:%02d:%02d",gio,phut,giay);
    }
    public int getgiay() {
        String[] tmp = this.tong.trim().split(":");
        return Integer.parseInt(tmp[0]) * 3600 + Integer.parseInt(tmp[1]) * 60 + Integer.parseInt(tmp[2]);
    }
    @Override
    public String toString(){
        return ma + " " +ten + " " +thanhtich +" " + uutien + " " + tong + " "  + thuhang;
    }
}
