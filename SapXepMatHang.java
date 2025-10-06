/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepMatHang;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class SapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<hang> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String ten = sc.nextLine(), nhom = sc.nextLine();
            double giamua = Double.parseDouble(sc.nextLine()), giaban = Double.parseDouble(sc.nextLine());
            list.add(new hang(ten,nhom,giamua,giaban));
        }
        Collections.sort(list, new Comparator<hang>(){
            public int compare(hang a,hang b) {
                return Double.compare(b.loinhuan, a.loinhuan);
            }
        });
        for(hang x : list) {
            System.out.println(x);
        }
    }
}
class hang{
    String ma,ten,nhom;
    double giamua,giaban,loinhuan;
    public static int dem = 1;
    hang(String a,String b, double x,double y){
        ten = a; nhom = b ; giamua = x; giaban = y;
        loinhuan = giaban - giamua;
        ma = String.format("MH%02d", dem++);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loinhuan);
    }
}
