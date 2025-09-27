/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimThuKhoaCuaKiThi;

/**
 *
 * @author PC
 */
import java.text.DecimalFormat;
import java.util.*;

public class TimThuKhoaCuaKiThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] a = new ThiSinh[n];
        double max = -1.0;
        for(int i = 0; i < n; i++) {
            a[i] = new ThiSinh();
            a[i].nhap(sc);
            max = Double.max(max, a[i].tong());
        }
        for(int i = 0; i < n; i ++) {
            if(a[i].tong() == max) System.out.println(a[i]);
        }
    }
}

class ThiSinh{
    String ten,ns;
    int stt;
    double diem1,diem2,diem3;
    public static int dem = 1;
    public void nhap(Scanner sc) {
        stt = dem++;
        ten = sc.nextLine();
        ns  = sc.nextLine();
        diem1 = Double.parseDouble(sc.nextLine());
        diem2 = Double.parseDouble(sc.nextLine());
        diem3 = Double.parseDouble(sc.nextLine());
    }
    public double tong() {
        return diem1 + diem2 + diem3;
    }
    @Override
    public String toString () {
        DecimalFormat f = new DecimalFormat();
        StringBuilder d = new StringBuilder();
        d.append(stt + " " + ten + " " + ns + " " + f.format(this.tong()));
        return d.toString().trim();
    }
}
