/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDanhSachDoiTuongNhanVien;

/**
 *
 * @author PC
 */
import java.util.*;

public class SapXepDanhSachDoiTuongNhanVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] a = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            a[i] = new NhanVien();
            a[i].nhap(sc);
        }
        List<NhanVien> list = Arrays.asList(a);
        Collections.sort(list, new sapxep());
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

class NhanVien {

    String ma, ten, gt, ns, dc, mst, nki;
    public static int dem = 1;

    public void nhap(Scanner sc) {
        ma = String.format("%05d", dem++);
        ten = sc.nextLine();
        gt = sc.nextLine();
        ns = sc.nextLine();
        dc = sc.nextLine();
        mst = sc.nextLine();
        nki = sc.nextLine();
    }

    @Override
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(ma + " " + ten + " " + gt + " " + ns + " " + dc + " " + mst + " " + nki);

        return d.toString().trim();
    }
}

class sapxep implements Comparator<NhanVien> {
    public int compare(NhanVien a, NhanVien b) {
        String[] tmp = a.ns.trim().split("/");
        String[] tmp2 = b.ns.trim().split("/");
        if(tmp[2].compareTo(tmp2[2]) != 0) return tmp[2].compareTo(tmp2[2]);
        else if(tmp[1].compareTo(tmp2[1]) != 0) return tmp[1].compareTo(tmp2[1]);
        return tmp[0].compareTo(tmp2[0]);
    }
}
