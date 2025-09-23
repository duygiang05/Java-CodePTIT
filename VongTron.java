/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class VongTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        diem[] a = new diem[26];
        for(int i = 0; i < 26; i++) {
            a[i] = new diem();
        }
        for(char x = 'A' ; x <= 'Z' ;x ++) {
            int ind = x - 'A';
            a[ind].x = s.indexOf(x);
            a[ind].y = s.lastIndexOf(x);
        }
        int cnt = 0;
        for(int i = 0; i < 25;i++) {
            for(int j = i + 1; j < 26;j ++) {
                if(a[i].x < a[j].x && a[j].x < a[i].y && a[i].y < a[j].y) cnt++;
                if(a[j].x < a[i].x && a[i].x < a[j].y && a[j].y < a[i].y) cnt++; 
            }
        }
        System.out.println(cnt);
    }
}
class diem {
    int x,y;
    diem() {
        x = 0; y = 0;
    }
}
