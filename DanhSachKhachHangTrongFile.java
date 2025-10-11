/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachKhachHangTrongFile;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class DanhSachKhachHangTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        List<kh> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n; i++) {
            String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine(), d = sc.nextLine();
            list.add(new kh(a,b,c,d));
        }
        Collections.sort(list,new Comparator<kh> () {
            public int compare(kh a, kh b) {
                if(a.nam != b.nam) return a.nam - b.nam;
                else if(a.thang != b.thang) return a.thang - b.thang;
                return a.ngay - b.ngay;
            }
        });
        for(kh x : list) {
            System.out.println(x);
        }
    }
}
class kh{
    String ma,ten="",ns,gt,dc;
    int ngay,thang,nam;
    public static int dem = 1;
    kh(String a,String b, String d, String e) {
        gt = b; dc = e;
        String [] tmp = a.trim().split("\\s+");
        for(String x : tmp) {
            ten += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        ten = ten.trim();
        String [] temp = d.trim().split("/");
        ngay = Integer.parseInt(temp[0]); thang = Integer.parseInt(temp[1]); nam = Integer.parseInt(temp[2]);
        ns = String.format("%02d/%02d/%s", ngay,thang,nam);
        ma = String.format("KH%03d", dem++);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gt + " " + dc + " " + ns;
    }
}
