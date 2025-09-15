/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        for(int i = 1 ;i <= t; i++) {
            int n = sc.nextInt();
            int[] b = new int[n];
            Map<Integer,Integer> mp = new HashMap<>();
            
            for(int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
                int get = mp.getOrDefault(b[j], 0);
                mp.put(b[j], get + 1);
            }
            System.out.println("Test " + i + ":");
            for(int j = 0; j < n ; j++) {
                int get = mp.getOrDefault(b[j], 0);
                if(get > 0) System.out.println(b[j] + " xuat hien " + get + " lan");
                mp.remove(b[j]);
            }
        }
    }
}
