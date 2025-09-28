/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreNhat_GiaNhat;

/**
 *
 * @author PC
 */
import java.util.*;
public class TreNhat_GiaNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        for(int i = 0; i < t; i ++) {
            String ten = sc.next(), ngaysinh = sc.next();
            list.add(new NhanVien(ten,ngaysinh));
        }
        Collections.sort(list, new sapxep());
        System.out.println(list.get(list.size()-1).ten);
        System.out.println(list.get(0).ten);
//        for(NhanVien x : list) {
//            System.out.println(x);
//        }
    }
}
class NhanVien {
    String ten,ngaysinh;
    int yyyy,mm,dd;
    NhanVien(String a,String b) {
        ten = a; ngaysinh = b;
        yyyy = Integer.parseInt(ngaysinh.substring(6));
        mm = Integer.parseInt(ngaysinh.substring(3,5));
        dd = Integer.parseInt(ngaysinh.substring(0,2));
    }
    @Override
    public String toString() {
        return ten + " "+ ngaysinh;
    }
}

class sapxep implements Comparator<NhanVien> {
    public int compare(NhanVien a , NhanVien b) {
        if(a.yyyy != b.yyyy) return a.yyyy - b.yyyy;
        else if(a.mm != b.mm) return a.mm - b.mm;
        return a.dd-b.dd;
    }
}
