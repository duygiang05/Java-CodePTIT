/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0 ;i < n; i ++) {
            int dem = 0;
            for(int j = 0 ; j < 3; j ++) {
                int x = sc.nextInt();
                if(x == 1) dem++;
            }
            if(dem > 1) cnt++;
        }
        System.out.println(cnt);
    }
}
