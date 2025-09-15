/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        
        Set<Integer> st1 = new TreeSet<>();
        for(int i = 0; i < n;i ++) {
            int x = sc.nextInt();
            st1.add(x);
        }
        
        Set<Integer> st2 = new TreeSet<>();
        for(int i = 0; i < m; i++) {
            int x = sc.nextInt();
            st2.add(x);
        }
        
        st1.retainAll(st2);
        
        for(int x : st1) {
            System.out.print(x + " ");
        }
    }
}