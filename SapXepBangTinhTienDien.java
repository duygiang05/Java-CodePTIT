/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepBangTinhTienDien;

/**
 *
 * @author PC
 */
import java.util.*;

public class SapXepBangTinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<tiendien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine().trim();
            long socu = Long.parseLong(sc.nextLine().trim()), somoi = Long.parseLong(sc.nextLine().trim());
            list.add(new tiendien(s,socu,somoi));
        }
        Collections.sort(list, new sapxep());
        for(tiendien x : list) {
            System.out.println(x);
        }
    }
}

class tiendien{
    String ma,stt;
    public static int dem = 1;
    long socu, somoi,heso,thanhtien,phutroi,tong;
    tiendien(String a,long x,long y) {
        stt = String.format("KH%02d",dem++);
        ma = a; socu = x;somoi = y;
        if(ma.compareTo("KD") == 0) heso = 3;
        else if(ma.compareTo("NN" ) == 0) heso = 5;
        else if(ma.compareTo("TT") == 0) heso = 4;
        else heso = 2 ;
        thanhtien = (somoi - socu ) * heso * 550;
        if(somoi - socu >  100) phutroi = thanhtien ; 
        else if(somoi - socu >= 50) phutroi = (thanhtien * 35 + 50) / 100;
        else phutroi = 0;
        tong = phutroi + thanhtien;
    }
    @Override
    public String toString() {
        return stt + " " + heso +" " +thanhtien +" " + phutroi +" " + tong;
    }
}

class sapxep implements Comparator<tiendien> {
    public int compare(tiendien a,tiendien b) {
        if(a.tong > b.tong) return -1;
        else if(a.tong == b.tong) return 0;
        return 1;
    }
}