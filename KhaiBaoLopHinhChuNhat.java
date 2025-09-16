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

public class KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        String s = sc.next();
        if(a <= 0 || b <= 0) System.out.println("INVALID");
        else {
            hcn A = new hcn(a,b,s);
            System.out.printf("%.0f %.0f %s", A.findPerimeter(), A.findArea(), A.getColor());
        }
    }
}

class hcn {
    double width, height;
    String color;
    hcn() {
        this.width = 1.0;
        this.height = 1.0;
    }
    
    hcn(double a, double b , String c) {
        this.width = a;
        this.height = b;
        this.color  = c;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        String s = "" ;
        char x = color.charAt(0);
        s += Character.toUpperCase(x) ;
        for(int i = 1; i < color.length(); i++) {
            char y = color.charAt(i);
            s += Character.toLowerCase(y);
        }
        return s;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double findArea () {
        return this.height * this.width;
    }
    public double findPerimeter() {
        return (this.height + this.width) * 2;
    }
}