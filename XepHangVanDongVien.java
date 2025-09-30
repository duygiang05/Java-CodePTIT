/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XepHangVanDongVien;

/**
 *
 * @author PC
 */
import java.util.*;
public class XepHangVanDongVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<VanDongVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine(), ns = sc.nextLine(),xp = sc.nextLine(),vd = sc.nextLine();
            list.add(new VanDongVien(s,ns,xp,vd));
        }
        List<VanDongVien> tmp = new ArrayList<>(list);
        Collections.sort(tmp, (a,b) -> a.getgiay() - b.getgiay());
        int rank = 1;
        for(int i = 0 ; i < tmp.size(); i++) {
            if(i > 0 && tmp.get(i).getgiay() != tmp.get(i-1).getgiay()) {
                rank = i + 1;
            }
            tmp.get(i).thuhang = rank;
        }
        for(VanDongVien x : list) {
            for(VanDongVien y : tmp) {
                if(x.ma.equals(y.ma)) {
                    x.thuhang = y.thuhang; 
                    break;
                }
            }
        }
        for(VanDongVien x : list) {
            System.out.println(x);
        }
    }
}
class VanDongVien {
    String ma,ten,xp,vd,ns,thanhtich,uutien,tong;
    int tuoi,thuhang;
    public static int dem = 1,nam = 2021;
    VanDongVien(String a,String b, String c, String d) {
        ma = String.format("VDV%02d", dem++);
        ten = a; ns = b; xp = c;vd = d;
        String []tmp = ns.trim().split("/");
        tuoi = nam - Integer.parseInt(tmp[2]);
        if(tuoi < 18) uutien = "00:00:00";
        else if(tuoi < 25) uutien = "00:00:01";
        else if(tuoi < 32) uutien = "00:00:02";
        else uutien = "00:00:03";
        thanhtich = tru(xp,vd);
        tong = tru(uutien,thanhtich);
    }
    public String tru(String a,String b){
        int nho = 0;
        int gio1 = Integer.parseInt(a.substring(0,2)), gio2 = Integer.parseInt(b.substring(0,2));
        int phut1 = Integer.parseInt(a.substring(3,5)), phut2 = Integer.parseInt(b.substring(3,5));
        int giay1 = Integer.parseInt(a.substring(6)), giay2 = Integer.parseInt(b.substring(6));
        int giayans = giay2 - giay1;
        if(giayans < 0) {
            nho = 1; giayans += 60;
        }
        int phutans = phut2-phut1-nho; nho = 0;
        if(phutans < 0) {
            phutans += 60; nho = 1;
        }
        int gioans = gio2-gio1-nho;
        return String.format("%02d:%02d:%02d", gioans,phutans,giayans);
    }
    int getgiay() {
        String [] tmp = this.tong.trim().split(":");
        int gio = Integer.parseInt(tmp[0]);
        int phut = Integer.parseInt(tmp[1]);
        int giay = Integer.parseInt(tmp[2]);
        return gio * 3600 + phut * 60 + giay;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + thanhtich + " "  + uutien + " " + tong +" " +thuhang;
    }
}

