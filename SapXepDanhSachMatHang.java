/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachMatHang;

/**
 *
 * @author PC
 */
import java.text.DecimalFormat;
import java.util.*;
public class SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] a = new MatHang[n];
        for(int i = 0 ; i < n; i++) {
            a[i] = new MatHang();
            a[i].nhap(sc);
        }
        List<MatHang> list = Arrays.asList(a);
        Collections.sort(list, new sapxep());
        for(int i = 0 ; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}

class MatHang {
    int stt;
    String ten, nhom;
    double giamua, giaban;
    public static int dem = 1;
    public void nhap(Scanner sc ) {
        stt = dem++;
        ten = sc.nextLine();
        nhom = sc.nextLine();
        giamua = Double.parseDouble(sc.nextLine());
        giaban = Double.parseDouble(sc.nextLine());
    } 
    @Override
    public String toString () {
        DecimalFormat f = new DecimalFormat("0.00");
        StringBuilder d = new StringBuilder();
        d.append(stt + " " +ten + " " + nhom + " " + f.format(giaban - giamua));
        return d.toString().trim();
    }
}
class sapxep implements Comparator<MatHang> {
    public int compare(MatHang a, MatHang b) {
        double x = a.giaban - a.giamua;
        double y = b.giaban - b.giamua;
        return Double.compare(y, x);
    }
}
