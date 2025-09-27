/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        mathang [] a = new mathang[t];
        for(int i = 0 ;i < t; i++) {
            a[i]= new mathang();
            a[i].nhap(sc);
        }
        List<mathang> list = Arrays.asList(a);
        Collections.sort(list, new Sosanhma());
        for(mathang i : list) {
            System.out.println(i);
        }
    }
}
class mathang {
    String ma, ten,donvitinh;
    int giamua,giaban;
    public static int dem = 1;
    public void nhap(Scanner sc ) {
        ma = String.format("MH%03d", dem++);
        ten = sc.nextLine();
        donvitinh = sc.nextLine();
        giamua = Integer.parseInt(sc.nextLine());
        giaban = Integer.parseInt(sc.nextLine());
    }
    @Override
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(ma + " " + ten + " " + donvitinh + " " +giamua + " " + giaban + " " + (giaban - giamua));
        return d.toString().trim();
    }
    
}
class Sosanhma implements Comparator<mathang> {
    public int compare( mathang a, mathang b) {
        return ( b.giaban - b.giamua) - (a.giaban - a.giamua) ;
    }
}
