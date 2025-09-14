/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class XauNhiPhan {

    static long[] f = new long[93];

    public static void ktao() {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
    }

    private static int xnp(int n, long k) {
//        System.out.println(n + " " + k);
        if(n <= 2) return n - 1;
        
        if(k > f[n-2]) return xnp(n-1,k - f[n-2]);
        return xnp(n-2,k);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ktao();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(xnp(n,k));
        }
//        for(int i = 0; i <= 20 ;i ++) {
//            System.out.println("So fibo thu :" + i + ": " + f[i] + " ");
//        }
    }
}
