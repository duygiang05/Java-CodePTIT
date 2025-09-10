/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaiPhuongTrinhBacNhat;

/**
 *
 * @author PC
 */
import java.util.*;
public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in) ;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a == b && b == 0) System.out.println("VSN");
        else if (a == 0 && b != 0) System.out.println("VN");
        else System.out.printf("%.2f\n", -b / a);
    }
}
