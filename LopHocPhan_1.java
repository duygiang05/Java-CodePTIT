/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopHocPhan_1;


/**
 *
 * @author PC
 */
import java.util.*;
public class LopHocPhan_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Lop> list = new ArrayList<>();
        Map<String ,String> mp = new HashMap<>();
        for(int i = 0 ;i < n; i++) {
            String a = sc.nextLine(), b = sc.nextLine(), c= sc.nextLine(), d = sc.nextLine();
            list.add(new Lop(a,b,c,d));
            mp.put(a,b);
        }
        Collections.sort(list,new Comparator<Lop>() {
            public int compare(Lop a, Lop b) {
                return Integer.parseInt(a.nhom) - Integer.parseInt(b.nhom);
            }
        });
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0 ;i < m; i ++) {
            String s = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + mp.get(s) + ":");
            for(Lop x : list) {
                if(x.ma.equals(s)) System.out.println(x);
            }
        }
    }
}
class Lop{
    String ma,ten,giangvien,nhom;
    Lop(String a, String b,String c,String d ) {
        ma = a; ten = b ;nhom = c; giangvien = d;       
    }
    @Override
    public String toString() {
        return nhom + " " + giangvien;
    }
}
