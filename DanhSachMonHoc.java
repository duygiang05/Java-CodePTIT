/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachMonHoc;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class DanhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<Mon> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i  = 0; i < n; i++) {
            sc.nextLine();
            String a = sc.nextLine(), b = sc.nextLine();
            int c = sc.nextInt();
            list.add(new Mon(a,b,c));
        }
        Collections.sort(list, new Comparator<Mon>(){
            public int compare(Mon a , Mon b) {
                return a.ten.compareTo(b.ten);
            }
        }) ;
        for(Mon x : list) {
            System.out.println(x);
        }
    }
}
class Mon{
    String ma,ten;
    int sotinchi;
    Mon(String a,String b,int c) {
        ma = a; ten = b; sotinchi = c;
    }
    @Override
    public String toString () {
        return ma + " " + ten + " " + sotinchi;
    }
}
