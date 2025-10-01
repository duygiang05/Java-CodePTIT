/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuaXeDap;

/**
 *
 * @author PC
 */
import java.util.*;
public class DuaXeDap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i = 0 ;i < n; i ++) {
            String a = sc.nextLine(), b = sc.nextLine(),c = sc.nextLine();
            list.add(new ThiSinh(a,b,c));
        }
        Collections.sort(list, new Comparator<ThiSinh>() {
            public int compare(ThiSinh a ,ThiSinh b) {
                return Double.compare(a.thanhtich, b.thanhtich);
            }
        });
        for(ThiSinh x : list) {
            System.out.println(x);
        }
    }
}
class ThiSinh {
    String hoten, donvi,tgian,ma="";
    double thanhtich;
    long vantoc;
    ThiSinh(String a,String b ,String c) {
        hoten = a;donvi = b;tgian = c;
        String tmp = donvi + hoten;
        for(int i = 0 ;i < tmp.length();i ++) {
            char x = tmp.charAt(i);
            if(Character.isAlphabetic(x) && Character.isUpperCase(x) ) ma += x;
        }
        String [] temp = tgian.trim().split(":");
        thanhtich = (Double.parseDouble(temp[0]) - 6 )  + Double.parseDouble(temp[1]) / 60;
        vantoc = Math.round(120.0/thanhtich);
    }
    @Override
    public String toString() {
        return ma + " " + hoten + " " + donvi + " " + vantoc + " Km/h";
    }
} 
