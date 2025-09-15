/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] b, prefix ;
            b = new int[n + 1];
            prefix = new int[n+1];
            for(int j = 1; j <= n ;j++ ) {
                b[j] = sc.nextInt();
                prefix[j] = prefix[j-1] + b[j];
            }
            int ind = -1;
            for(int j = 2; j < n ;j ++ ) {
                int r = prefix[n] - prefix[j];
                int l = prefix[n] - r - b[j];
                if(l == r) {
                    ind = j; break;
                }
            }
            System.out.println(ind);
        }
    }
}
