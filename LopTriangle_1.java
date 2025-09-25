/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.text.DecimalFormat;
import java.util.*;

public class LopTriangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

class Point {
    double x,y;
    public Point(double a, double b) {
        x = a; y = b;
    }
    
    public static Point nextPoint (Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
}

class Triangle {
    Point a,b,c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b; 
        this.c = c;
    }
    public double kc(Point a, Point b) {
        double x = a.x - b.x;
        double y = a.y - b.y;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public boolean valid() {
        double c1 = kc(this.a,this.b), c2 = kc(this.a,this.c) , c3 = kc(this.b,this.c);
        if(c1 + c2 <= c3 || c1 + c3 <= c2 || c2 + c3 <= c1) return false;
        return true;
    }
    public String getPerimeter () {
        DecimalFormat df = new DecimalFormat("0.###");
        double c1 = kc(this.a,this.b), c2 = kc(this.a,this.c) , c3 = kc(this.b,this.c);
        return df.format(c1 + c2 + c3);
    }
}


