/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TenVietTat;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class TenVietTat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<hoten> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n; i++) {
            list.add(new hoten(sc.nextLine()));
        }
        Collections.sort(list,new Comparator<hoten>() {
            public int compare(hoten a, hoten b) {
                if(!a.ten.equals(b.ten)) return a.ten.compareTo(b.ten);
                else if(!a.ho.equals(b.ho)) return a.ho.compareTo(b.ho);
                return a.dem.compareTo(b.dem);
            }
        });
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < m;i++) {
            String s = sc.nextLine();
//            System.out.println(s);
            String [] tmp = s.trim().split("\\.");
            for(hoten x : list) {
                if(x.check(tmp)) System.out.println(x);
            }
        }
//        for(hoten x : list) {
//            System.out.println(x);
//        } 
    }
}
class hoten{
    String ho="",dem="",ten="";
    String [] temp = null;
    public boolean check(String [] x) {
        if(this.temp.length != x.length) return false;
        for(int i = 0;i < x.length;i++) {
            if("*".equals(x[i])) continue;
            String y = this.temp[i].substring(0,1);
            if(!y.equals(x[i])) return false;
        }
        return true;
    }
    hoten(String s) {
        String [] tmp = s.trim().split("\\s+");
        temp = tmp;
        ho = tmp[0];
        ten = tmp[tmp.length - 1];
        for(int i = 1;i < tmp.length - 1; i++) {
            dem += tmp[i] + " ";
        }
        dem = dem.trim();
    }
    @Override
    public String toString() {
        return ho  + " " + dem + " " + ten; 
    }
}