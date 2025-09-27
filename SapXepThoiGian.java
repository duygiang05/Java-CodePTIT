/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;
public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        tgian[] a = new tgian[t];
        for(int i = 0; i < t; i++) {
            a[i] = new tgian();
            a[i].nhap(sc);
        }
        List<tgian> list = Arrays.asList(a);
        Collections.sort(list,new Sosanh());
        for(int i = 0; i < t; i ++) {
            System.out.println(list.get(i));
        }
    }
}

class tgian{
    int gio, phut ,giay;
    public void nhap(Scanner sc) {
        gio = sc.nextInt();
        phut = sc.nextInt();
        giay = sc.nextInt();
    }
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(gio + " " + phut + " " + giay + "\n" );
        return d.toString().trim();
    }
}

class Sosanh implements Comparator<tgian> {
    public int compare(tgian a, tgian b) {
        int x = a.gio - b.gio;
        int y = a.phut - b.phut;
        int z = a.giay - b.giay;
        if(x != 0) return x;
        else if(y != 0) return y;
        return z;
    }
}
 