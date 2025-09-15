/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class HopCua2DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> st = new TreeSet<>();
        for(int i = 0; i < n + m ;i++) {
            int x = sc.nextInt();
            st.add(x);
        }
        st.forEach((x) ->System.out.print(x +" "));
    }
}
