/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
import java.lang.*;
public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            diem A = new diem(), B = new diem(), C = new diem();
            A.nhap(sc); B.nhap(sc); C.nhap(sc);
            if(!A.check(A, B, C)) System.out.println("INVALID");
            else {
                System.out.printf("%.3f\n", A.chuvi(A, B, C));
            }
        }
    }
}
class diem {
    double x,y;
    diem(){}
    diem(double a, double b) {
        x = a; y = b;
    }
    diem (diem a) {
        this.x = a.x;
        this.y = a.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance (diem a) {
        double tmp = this.x - a.x , tmp1 = this.y - a.y;
        return Math.sqrt(Math.pow(tmp, 2) + Math.pow(tmp1, 2));
    }
    
    public double distance (diem a,diem b) {
        double tmp = b.x - a.x , tmp1 =b.y - a.y;
        return Math.sqrt(Math.pow(tmp, 2) + Math.pow(tmp1, 2));
    }
    
    public void nhap(Scanner sc) {
        this.x = sc.nextDouble() ; this.y = sc.nextDouble();
    }
    
    public double chuvi(diem a, diem b, diem c) {
        double x1 = distance(a,b), x2 = distance(a,c) , x3 = distance(b, c);
        return x1 + x2 + x3;
    }
    public boolean check(diem a, diem b, diem c ) {
        double x1 = distance(a,b), x2 = distance(a,c) , x3 = distance(b, c);
        if(x1 + x2 <= x3 || x1 + x3 <= x2 || x2 + x3 <= x1) return false;
        return true;
    }
}