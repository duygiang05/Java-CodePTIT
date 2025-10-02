/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuongMuaTrungBinh;

/**
 *
 * @author PC
 */
import java.util.*;
public class LuongMuaTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String,Tram> mp = new LinkedHashMap<>();
        for(int i = 0 ;i < n; i ++) {
            String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine();
            double x = Double.parseDouble(sc.nextLine());
            if(mp.containsKey(a)) {
                mp.get(a).setTgian(b, c); mp.get(a).setTong(x);
                mp.get(a).setTb();
            }
            else {
                mp.put(a, new Tram(a,b,c));
                mp.get(a).setTgian(b, c); mp.get(a).setTong(x);
                mp.get(a).setTb();
            }
        }
        mp.forEach((key,value)->{
            System.out.println(value);
        });
    }
}
class Tram{
    String ten,ma,bd,kt;
    double tgian,luongmua,tb;
    public static int dem = 1;
    Tram(String a, String b ,String c) {
        ten = a;bd = b; kt = c;
        ma = String.format("T%02d", dem ++);
    }
    public void setTgian(String a, String b) {
        String[] t1 = a.trim().split(":");
        String [] t2 = b.trim().split(":");
        double x = Double.parseDouble(t2[0]) - Double.parseDouble(t1[0]);
        double y = Double.parseDouble(t2[1]) - Double.parseDouble(t1[1]);
        
        this.tgian += x + y/60;        
    }
    public void setTong(double x) {
        this.luongmua += x;
    }
    public void setTb() {
        this.tb = this.luongmua / this.tgian;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + String.format("%.2f", tb);
    }
}
