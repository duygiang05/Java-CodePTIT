/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class LopPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }
}

class Pair<u,v> {
    u a;
    v b;
    public boolean chekc(Integer a) {
        for(Integer i = 2; i * i <= a;i ++) {
            if(a % i == 0) return false;
        }
        return a > 1;
    }
    
    Pair(u x, v y) {
        this.a = x;
        this.b = y;
    }
    public boolean isPrime() {
        if(chekc((Integer) this.a) && chekc((Integer) this.b)) return true;
        return false;
    }
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(this.a + " " + this.b + "\n");
        return d.toString().trim();
    }
}
