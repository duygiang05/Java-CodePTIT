/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauLacBoBongDa_2;

/**
 *
 * @author PC
 */
import java.util.*;
public class CauLacBoBongDa_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<DoiBong> list = new ArrayList<>();
        List<TranDau> list1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String a = sc.nextLine(), b = sc.nextLine();
            long x = Long.parseLong(sc.nextLine());
            list.add(new DoiBong(a,b,x));
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            String tmp = sc.next();
            long x = sc.nextLong();
            TranDau y = new TranDau(tmp);
            for(DoiBong temp : list) {
                if(tmp.substring(1,3).equals(temp.ma)) {
                    y.ten = temp.ten;
                    y.thunhap = temp.giave * x;
                }
            }
            list1.add(y);
        }
        Collections.sort(list1, new Comparator<TranDau>() {
            public int compare(TranDau a, TranDau b) {
                if(b.thunhap != a.thunhap) return Long.compare(b.thunhap, a.thunhap);
                return a.ten.compareTo(b.ten);
            }
        });
        for(TranDau tmp : list1){
            System.out.println(tmp);
        }
    }
}

class DoiBong{
    String ma,ten;
    long giave;
    DoiBong(String ma,String ten,long giave) {
        this.ma = ma;this.ten = ten; this.giave = giave;
    }
}
class TranDau{
    String ma,ten;
    long thunhap;
    TranDau(String s) {
        ma = s;
    }
    @Override
    public String toString() {
        return ma +  " " +ten + " "+thunhap; 
    }
}