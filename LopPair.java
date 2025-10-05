/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopPair;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class LopPair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
class Pair< type1, type2> {
    type1 x; type2 y;
    public boolean check(Integer x) {
        for(Integer i = 2; i * i <= x;i++) {
            if(x % i == 0) return false;
        }
        return x > 1;
    }
    Pair(type1 a,type2 b) {
        this.x = a; this.y = b;
    }
    public boolean isPrime() {
        return check((Integer)this.x) && check((Integer)this.y);
    }
    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}
