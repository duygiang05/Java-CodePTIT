/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoaiPhong;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.*;
import java.util.*;

public class LoaiPhong_ {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}

class LoaiPhong implements Comparable<LoaiPhong>{

    String ma, ten;
    long dongia;
    double phi;

    LoaiPhong(String s) {
        String [] tmp = s.trim().split("\\s+");
        this.ma = tmp[0]; this.ten = tmp[1];
        this.dongia = Long.parseLong(tmp[2]); this.phi = Double.parseDouble(tmp[3]);
    }
    @Override
    public int compareTo(LoaiPhong b) {
        return this.ten.compareTo(b.ten);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dongia + " " + phi;
    }
}
