/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DanhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        MonHoc[] a = new MonHoc[t];
        for(int i = 0; i < t; i ++) {
            a[i] = new MonHoc();
            a[i].nhap(sc);
        }
        List<MonHoc> list = Arrays.asList(a);
        Collections.sort(list,new Sosanh());
        for(int i = 0 ; i < t; i ++) {
            System.out.println(list.get(i));
        }
    }
}
class MonHoc{
    String ma,ten,hinhthucthi;
    public void nhap(Scanner sc) {
        ma = sc.nextLine();
        ten = sc.nextLine();
        hinhthucthi = sc.nextLine();
    }
    @Override
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(ma + " " + ten + " " + hinhthucthi+ "\n");
        return d.toString().trim();
    }
}

class Sosanh implements Comparator<MonHoc> {
    
    public int compare(MonHoc a, MonHoc b) {
        return a.ma.compareTo(b.ma);
    }
}