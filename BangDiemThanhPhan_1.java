/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangDiemThanhPhan_1;

/**
 *
 * @author PC
 */
import java.util.*;
public class BangDiemThanhPhan_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> d = new ArrayList<>();
        for(int i = 0 ;i < n; i ++ ) {
            String a = sc.nextLine(),b = sc.nextLine(),c = sc.nextLine();
            double x = Double.parseDouble(sc.nextLine()), y = Double.parseDouble(sc.nextLine()), z = Double.parseDouble(sc.nextLine());
            d.add(new SinhVien(a,b,c,x,y,z));
        }
        Collections.sort(d, new sapxep());
        int dem = 1;
        for(SinhVien x : d) {
            System.out.println(dem++ + " " +x );
        }
    }
}

class SinhVien{
    String ma,ten,lop;
    double diem1,diem2,diem3;
    SinhVien(String a,String b, String c, double x,double y,double z) {
        ma = a; ten = b; lop = c;
        diem1 = x; diem2 = y;diem3 = z;
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + diem1 + " " + diem2 + " " + diem3 ;
    }
}
class sapxep implements Comparator<SinhVien> {
    public int compare(SinhVien a,SinhVien b){
        return a.ma.compareTo(b.ma);
    }
}
