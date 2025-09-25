/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DienTichHinhTronNgoaiTiepTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ;i  < t; i ++) {
            Diem a = new Diem(), b = new Diem(),c = new Diem();
            a.nhap(sc); b.nhap(sc) ;c.nhap(sc);
            if(a.check(a, b, c) == false) System.out.println("INVALID");
            else {
                System.out.printf("%.3f\n",a.ngoaitiep(a, b, c));
            }
        }
    }
}
class Diem{
    double x,y;
    public void nhap(Scanner sc) {
        this.x = sc.nextDouble();
        this.y = sc.nextDouble(); 
    }
    public double kc(Diem a, Diem b) {
        double x = a.x - b.x;
        double y = a.y - b.y;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public boolean check (Diem a, Diem b, Diem c) {
        double c1 = kc(a,b), c2 = kc(a,c), c3 = kc(b,c);
        if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1) return false;
        return true;
    }
    
    public double dientich(Diem a, Diem b, Diem c) {
        double c1 = kc(a,b), c2 = kc(a,c), c3 = kc(b,c);
        double x = (c1+c2+c3) * (c1+c2-c3) * (c1+c3-c2) * (c2+c3-c1);
        return Math.sqrt(x)/4;
    }
    public double ngoaitiep(Diem a,Diem b,Diem c) {
        double c1 = kc(a,b), c2 = kc(a,c), c3 = kc(b,c);
        double x = dientich(a,b,c);
        double tmp = (c1*c2*c3) / (4.0*x);
        return Math.PI * Math.pow(tmp, 2);
    }
}