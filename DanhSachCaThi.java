/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachCaThi;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class DanhSachCaThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        List<Ca> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ;i < n; i++ ) {
            String ngay = sc.nextLine(), gio = sc.nextLine(), phong = sc.nextLine();
            list.add(new Ca(ngay,gio,phong));
        }
        Collections.sort(list, new Comparator<Ca>() {
            public int compare(Ca a,Ca b) {
                if(a.year != b.year) return a.year - b.year;
                else if(a.month != b.month ) return a.month - b.month;
                else if(b.date != a.date) return a.date - b.date;
                else if(a.hours != b.hours) return a.hours - b.hours;
                else if(a.mins != b.mins) return a.mins - b.mins;
                return a.ma.compareTo(b.ma);
            }
        });
        for(Ca x : list) {
            System.out.println(x);
        }
    }
}
class Ca {
    String ma,ngay,gio,phong;
    int date,month,year,hours,mins;
    public static int dem = 1;
    Ca(String b,String c, String d) {
        ngay = b; gio = c; phong = d;
        ma = String.format("C%03d", dem++);
        String [] tmp = ngay.trim().split("/");
        date = Integer.parseInt(tmp[0]); month = Integer.parseInt(tmp[1]); year = Integer.parseInt(tmp[2]);
        String [] tmp1 = gio.trim().split(":");
        hours = Integer.parseInt(tmp1[0]); mins = Integer.parseInt(tmp1[1]);
    }
    @Override
    public String toString () {
        return ma + " " + ngay + " "  + gio + " " + phong;
    }
}
