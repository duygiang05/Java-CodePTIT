/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LichGiangDayTheoMonHoc;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class LichGiangDayTheoMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Map<String,String> mp = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0 ;i < n; i++) {
            sc.nextLine();
            String ma = sc.nextLine(), ten = sc.nextLine();
            mp.put(ma,ten);
            int sotin = sc.nextInt();
        }
        sc.close();
        sc = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc.nextLine());
        List<lich> list = new ArrayList<>();
        for(int i = 0;i < m ;i++) {
            String ma = sc.nextLine();
            int thu = sc.nextInt(), kip = sc.nextInt();
            sc.nextLine();
            String ten = sc.nextLine(), phonghoc = sc.nextLine();
            list.add(new lich(ma,ten,phonghoc,thu,kip));
        }
        Collections.sort(list,new Comparator<lich>() {
            public int compare(lich a, lich b) {
                if(a.thu != b.thu) return a.thu - b.thu;
                else if(a.kip != b.kip ) return a.kip - b.kip;
                return a.hoten.compareTo(b.hoten);
            }
        });
        String s = sc.nextLine(), tmp = mp.get(s);
        System.out.println("LICH GIANG DAY MON " + tmp +":");
        for(lich x : list) {
            if(x.ma.equals(s)) System.out.println(x);
        }
        sc.close();
    }
}
class lich{
    String ma,stt,hoten,phonghoc;
    int thu,kip;
    public static int dem = 1;
    lich(String a,String b,String c,int d,int e) {
        ma = a; hoten = b; phonghoc = c;
        thu = d; kip = e;
        stt = String.format("HP%03d", dem++);
    }
    @Override
    public String toString () {
        return stt + " " + thu + " " + kip+  " " + hoten + " " + phonghoc;
    }
}
