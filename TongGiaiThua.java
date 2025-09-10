/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (int i = 1; i <= n ;i ++) {
            long res = 1;
            for (int j = 1;j <=i ;j ++) {
                res *= 1L * j;
            }
            ans += res;
        }
        System.out.println(ans);
    }
}
