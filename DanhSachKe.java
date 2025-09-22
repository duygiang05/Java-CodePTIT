/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        List<Integer>[] x = new ArrayList[n];
        
        for(int i = 0 ; i < n; i ++) {
            x[i] = new ArrayList<>();
        }
        
        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n; j ++) {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1 ) x[i].add(j + 1);
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print("List(" + (i + 1) + ") = ");
            for(int j : x[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
