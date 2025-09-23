/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class XuLiVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<String> a = new ArrayList<>();
        while(sc.hasNext()) {
            a.add(sc.next().toLowerCase());
        }
//        for(String x : a) {
//            System.out.print(x + " ");
//        }
        boolean xd = true;
        for(int i = 0 ; i < a.size() ; i++) {
            String tmp = a.get(i);
            if(xd == true) {
                xd = false;
                char x = Character.toUpperCase(tmp.charAt(0));
                tmp = Character.toString(x) + tmp.substring(1);
            }
            char x = tmp.charAt(tmp.length() - 1);
            boolean check = false;
            if(x == '.' || x == '?' || x == '!') {
                tmp = tmp.substring(0,tmp.length() - 1);
                xd = true; check = true;
            }
            System.out.print(tmp + " ");
            if(check) System.out.println();
        }
    }
}
