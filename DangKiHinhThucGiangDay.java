/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DangKiHinhThucGiangDay;

/**
 *
 * @author PC
 */
import java.io.*;
import java.util.*;
public class DangKiHinhThucGiangDay {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<mon> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String ma = sc.nextLine(), ten = sc.nextLine();
            int sotin = Integer.parseInt(sc.nextLine());
            String lt = sc.nextLine(), th = sc.nextLine();
            list.add(new mon(ma,ten,lt,th,sotin));
        }
        Collections.sort(list, new Comparator<mon>() {
            public int compare(mon a, mon b) {
                return a.ma.compareTo(b.ma);
            }
        });
        for(mon x : list ){
            if(!x.th.equals("Truc tiep")) System.out.println(x);
        }
    }
}
class mon{
    String ma,ten,lt,th;
    int sotin;
    mon(String a, String b, String c, String d,int e) {
        ma = a; ten = b; lt = c; th = d; sotin = e;
    }
    @Override
    public String toString () {
        return ma + " " + ten + " " + sotin + " "  + lt + " " + th;
    }
}
