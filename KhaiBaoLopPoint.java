/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.khaibaolopvadoituong;

/**
 *
 * @author PC
 */
import java.util.*;
import java.lang.*;

public class KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t; i ++) {
            double a = sc.nextDouble() , b= sc.nextDouble();
            double c = sc.nextDouble(), d = sc.nextDouble();
            point A = new point(a,b);
            point B = new point(c,d);
            double x = A.distance(B);
            System.out.printf("%.4f\n" , x);
        }
    }
}

class point {
    double x,y;
    point() {
        this.x = 0.0;
        this.y = 0.0;
    }
    point(double a, double b) {
        this.x = a;
        this.y = b;
    }
    point(point a) {
        this.x = a.x;
        this.y = a.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(point a) {
        double x1 = this.x - a.x;
        double y1 = this.y - a.y;
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
    }
    
    public double distance(point a,point b) {
        double x1 = b.x - a.x;
        double y1 = b.y - a.y;
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
    }
}