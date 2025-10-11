/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepMaTran;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;

public class SapXepMaTran {
    public static int[][] chuyenvi(int [][] matran,int n,int m) {
        int [][] ans = new int[m][n];
        for(int i = 0 ; i < n;i++) {
            for(int j = 0; j < m; j++) {
                ans[j][i] = matran[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MATRIX.in");
        Scanner sc = new Scanner(f);
        int t = sc.nextInt();
        for(int i = 0 ;i < t; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt();
            int [][] matran = new int[n][m];
            for(int j = 0; j < n; j++) {
                for(int k = 0;k < m;k++) matran[j][k] = sc.nextInt();
            }
            int [][] ans = chuyenvi(matran,n,m);
            Arrays.sort(ans[y-1]);
            matran = chuyenvi(ans,m,n);
            for(int j = 0; j < n; j++) {
                for(int k = 0;k < m;k ++) {
                    System.out.print(matran[j][k] + " ");
                }
                System.out.println();
            }
        }
        
    }
}
