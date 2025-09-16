/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class Bo3SoPytago {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextLong();
                a[j] *= a[j];
            }
            Arrays.sort(a);
            boolean check = false;
            for (int ind = n - 1; ind > 1; ind--) {
                int l = 0, r = ind - 1;
                while (l < r) {
                    long x = a[l] + a[r];
                    if (x == a[ind]) {
                        check = true;
                        break;
                    }
                    else if(x > a[ind]) r--;
                    else l++;
                }
                if(check) break;
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
