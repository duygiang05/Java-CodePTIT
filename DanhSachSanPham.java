/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachSanPham;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class DanhSachSanPham {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<sp> list = new ArrayList<>();
        for(int i = 0 ;i < n; i++) {
            String ma = sc.nextLine(), ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine()) , than = Integer.parseInt(sc.nextLine());
            list.add(new sp(ma,ten,gia,than));
        }
        Collections.sort(list, new Comparator<sp>() {
            public int compare(sp a , sp b) {
                if(a.gia != b.gia) return b.gia - a.gia;
                return a.ma.compareTo(b.ma);
            }
        });
        for(sp x : list ) {
            System.out.println(x);
        }
    }
}
class sp{
    String ma,ten;
    int gia,than;
    sp(String a,String b,int c, int d) {
        ma = a; ten = b; gia = c; than = d; 
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gia + " " + than;
    }
}
