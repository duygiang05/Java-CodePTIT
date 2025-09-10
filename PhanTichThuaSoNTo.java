/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
public class PhanTichThuaSoNTo {
    public static void ptich(int n) {
        for (int i = 2; i * i <= n ;i++) {
            if (n % i == 0) {
                int cnt = 0;
                while(n % i == 0) {
                    cnt ++;
                    n /= i;
                }
                System.out.printf("%d(%d) ",i,cnt);
            }
        }
        if (n > 1) System.out.printf("%d(%d)",n,1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t ;i ++){
            int n = sc.nextInt();
            System.out.printf("Test %d: ",i);
            ptich(n);
            System.out.println();
        }
    }
}
