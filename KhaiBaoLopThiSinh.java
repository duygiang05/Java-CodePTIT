/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String z = sc.nextLine();
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        thisinh A = new thisinh(s,z,a,b,c);
        A.in();
    }
}
class thisinh{ 
    String ten , ma;
    double diem1, diem2 , diem3;
    
    thisinh(String x,String y, double a, double b, double c)  {
        ten = x; ma = y;
        diem1 = a; diem2 = b; diem3 = c;
    }
    
    public void in() {
        System.out.printf("%s %s %.1f", ten,ma, diem1 + diem2 + diem3);
    }
}