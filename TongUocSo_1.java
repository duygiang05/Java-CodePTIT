/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class TongUocSo_1 {
    static int[] a = new int[2000005];
    private static void ktao() {
        for(int i = 0 ; i < 2000005; i++) a[i] = i;
        for(int i = 2 ; i * i < 2000005; i++) {
            if(a[i] == i) {
                for(int j = i * i; j < 2000005; j += i) {
                    if(a[j] == j) a[j] = i;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        ktao();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for(int i = 0 ; i < n; i++) {
            int x = sc.nextInt();
            while(x > 1) {
                ans += a[x];
                x /= a[x];
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
