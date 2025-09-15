/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class LietKeToHop_1 {
    static int dem = 0;
    public static void sinh(int n,int k,int[] x ,int ind) {
        if(ind > k) {
            dem ++ ;
            for(int i = 1; i <= k ; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println(); 
            return;
        }
        
        for(int j = x[ind - 1] + 1; j <= n - k + ind;j++  ) {
            x[ind] = j;
            sinh(n,k,x,ind+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] x = new int[k+1];
        sinh(n,k,x,1);
        System.out.printf("Tong cong co %d to hop" , dem);
    }
}
