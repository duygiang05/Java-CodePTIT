/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDonTienNuoc;

/**
 *
 * @author PC
 */
import java.util.*;

public class HoaDonTienNuoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<KhachHang> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String a = sc.nextLine();
            int x = sc.nextInt(), y = sc.nextInt();
            list.add(new KhachHang(a, x, y));
//            System.out.println("Het test");
        }
        Collections.sort(list, new Comparator<KhachHang>() {
            public int compare(KhachHang a, KhachHang b) {
                return Long.compare(b.tong , a.tong);
            }
        });
        for (KhachHang x : list) {
            System.out.println(x);
        }
    }
}

class KhachHang {

    String ten, ma;
    long chisocu, chisomoi, checklech, tong = 0;
    public static int dem = 1;

    KhachHang(String a, int x, int y) {
        ma = String.format("KH%02d", dem++);
        ten = a;
        chisocu = x;
        chisomoi = y;
        checklech = chisomoi - chisocu;
        if (checklech > 50) {
            tong += 5000;
        } else {
            tong += Math.round(checklech * 100 * 1.02);
        }
        if (checklech > 100) {
            tong += 7500;
            tong += Math.round((checklech - 100) * 200 );
            tong = Math.round(tong * 1.05);
        } else {
            if(checklech > 50) {
                tong += Math.round((checklech - 50) * 150);
                tong = Math.round(tong * 1.03);
            }
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tong ;
    }
}
