/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
public class KiemTraSoFibonacci {

    /**
     * @param args the command line arguments
     */
    static long a[] = new long[93];
    public static void ktao() {
        a[0] = 0; a[1] = 1;
        for (int i = 2;i < 93;i ++){
            a[i] = a[i-1] + a[i-2];
        }
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ktao();
        int t = sc.nextInt();
        for (int i = 0 ;i < t; i++) {
            long n = sc.nextLong();
            boolean check = false;
            for (int j = 0;j < 93;j ++) {
                if (a[j] == n ) {
                    check = true; break;
                }
            }
            if (!check) System.out.println("NO");
            else System.out.println("YES");
        }
    }
    
}
