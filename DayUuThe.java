/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DayUuThe {
    private static boolean check(List<Integer> a) {
        int cntc = 0, cntl = 0;
        for(int x : a) {
            if(x % 2 == 0) cntc ++;
            else cntl ++;
        }
        if(a.size() % 2 == 0 && cntc > cntl) return true;
        if(a.size() % 2 == 1 && cntl > cntc ) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t; i ++) {
            List<Integer> a = new ArrayList<>();
            String s = sc.nextLine();
            String[] x = s.trim().split(" ");
            for(String tmp : x) {
                a.add(Integer.valueOf(tmp));
            }
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
