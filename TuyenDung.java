/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TuyenDung;

/**
 *
 * @author PC
 */
import java.util.*;
public class TuyenDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i = 0 ; i < n; i++) {
            String a = sc.nextLine();
            double b = Double.parseDouble(sc.nextLine()), c = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(a,b,c));
        }
        Collections.sort(list,new Comparator<ThiSinh>(){
            public int compare(ThiSinh a, ThiSinh b) {
                return Double.compare(b.tb,a.tb);
            }
        });
        for(ThiSinh x : list) {
            System.out.println(x);
        }
    }
}
class ThiSinh{
    String hoten,ma,tt;
    double lt,th,tb;
    public static int dem = 1;
    ThiSinh(String a,double b,double c) {
        hoten = a; lt = b;th = c;
        ma = String.format("TS%02d",dem++) ;
        if(lt > 10) lt /= 10.0;
        if(th > 10) th /= 10.0;
        tb = (lt + th) / 2;
        if(th > 9.5) tt = "XUAT SAC";
        else if(th >= 8) tt = "DAT";
        else if(th >= 5 ) tt = "CAN NHAC";
        else tt = "TRUOT";        
    }
    @Override
    public String toString () {
        return ma + " " + hoten + " " + String.format("%.2f", tb) + " " + tt;
    }
}
