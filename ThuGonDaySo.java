/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n ;i++) {
            int x = sc.nextInt();
            if(st.isEmpty()) st.push(x);
            else {
                if((st.peek() + x) % 2 == 0) st.pop();
                else st.push(x);
            }
        }
        System.out.println(st.size());
    }
}
