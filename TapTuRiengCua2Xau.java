/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class TapTuRiengCua2Xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i < t; i ++) {
            String s = sc.nextLine();
            String[] x1 = s.trim().split(" ");
            String s2 = sc.nextLine();
            String[] x2 = s2.trim().split(" ");
            Set<String> set1 = new HashSet<>(Arrays.asList(x1));
            Set<String> set2 = new HashSet<>(Arrays.asList(x2));
            set1.removeAll(set2);
            for(String it : set1) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}
