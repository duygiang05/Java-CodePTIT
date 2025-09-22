/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> mp = new LinkedHashMap<>();
        for(int i = 0; i < t; i ++) {
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");            
            String tmp = (x[x.length -1].toLowerCase());
            for(int j = 0; j < x.length - 1;j ++) {
                tmp += (Character.toLowerCase(x[j].charAt(0)));
            }
            int cnt = mp.getOrDefault(tmp, 0);
            if(cnt == 0) {
                cnt++;
                System.out.println(tmp + "@ptit.edu.vn");
            }
            else {
                cnt++;
                System.out.println(tmp + cnt + "@ptit.edu.vn");
            }               
            mp.put(tmp, cnt);
        }
    }
}
