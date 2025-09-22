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

public class BoiSoNNCuaNSoNguyenDuongDauTien {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[101];
        for(int i = 0; i < t; i++) {
            Arrays.fill(a, 0);
            int n = sc.nextInt();
            long ans = 1;
            for(int j = 2; j <= n; j++) {
                int tmp = j;
                for(int k = 2; k * k <= tmp; k ++) {
                    if (tmp % k == 0) {
                        int cnt = 0;
                        while(tmp % k == 0) {
                            cnt++; tmp/= k;
                        }
                        a[k] = Integer.max(a[k], cnt);
                    }
                }
                if( tmp > 1) a[tmp] = Integer.max(a[tmp],1);
            }
            for(int f = 2; f <= n; f ++) {
                if(a[f] > 0) {
                    ans *= Math.pow(f, a[f]);
                }
            }
            System.out.println(ans);
//            for(int x = 0; x <= n; x ++) {
//                System.out.print(a[x]+ " ");
//            }
        }
    }
}
