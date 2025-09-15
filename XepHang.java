/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pair[] p = new pair[n];
        for(int i = 0; i < n ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            p[i] = new pair(a,b);
        }
        Arrays.sort(p,Comparator.comparingInt(x -> x.fi));
        int tmp = 0;
        for(pair x : p) {
            if(x.fi >= tmp) tmp = x.fi + x.se;
            else tmp += x.se;
        }
        System.out.println(tmp);
    }
}

class pair {
    int fi, se;
    pair (int a,int b) {
        this.fi = a;
        this.se = b;
    }
};