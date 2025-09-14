/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class BoiSoChung_UocSoChung {
    
    private static int ucln(int a,int b) {
        if(b == 0) return a;
        return ucln(b,a%b);
    }
    
    private static long bcnn(int a,int b) {
        return 1L * a * b / ucln(a,b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("%d %d\n",bcnn(a,b),ucln(a,b));
        }
    }
}
