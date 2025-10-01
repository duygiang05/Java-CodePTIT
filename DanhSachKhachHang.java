/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachKhachHang;

/**
 *
 * @author PC
 */
import java.util.*;
public class DanhSachKhachHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        for(int i = 0; i < n; i ++) {
            String a = sc.nextLine(),b = sc.nextLine(),c = sc.nextLine(),ad = sc.nextLine();
            list.add(new KhachHang(a,b,c,ad));
        }
        Collections.sort(list, new Comparator<KhachHang>() {
            public int compare(KhachHang b, KhachHang a) {
                if(a.nam != b.nam) return b.nam- a.nam;
                else if(a.thang != b.thang) return b.thang - a.thang;
                return b.ngay - a.ngay;
            }
        });
        for(KhachHang x : list) {
            System.out.println(x);
        }
    }
}
class KhachHang {
    String ma,ten="",gioitinh,ngaysinh="",diachi;
    int ngay,thang,nam;
    public static int dem = 1;
    KhachHang (String a, String b, String c, String d) {
        ma = String.format("KH%03d", dem++);
        gioitinh = b;diachi  = d;
        String [] tmp = a.trim().split("\\s+");
        for(String y : tmp) {
            ten += Character.toString(y.charAt(0)).toUpperCase() + y.substring(1).toLowerCase() + " ";
        }
        ten = ten.trim();
        String [] tmp2 = c.trim().split("/");
        ngay = Integer.parseInt(tmp2[0]);
        thang = Integer.parseInt(tmp2[1]);
        nam = Integer.parseInt(tmp2[2]);
        
        ngaysinh = String.format("%02d/%02d/%d", ngay,thang,nam); 
        
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + gioitinh + " " + diachi + " " + ngaysinh;
    }
}
