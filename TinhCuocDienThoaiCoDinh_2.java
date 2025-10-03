/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhCuocDienThoaiCoDinh_2;

/**
 *
 * @author PC
 */
import java.util.*;
public class TinhCuocDienThoaiCoDinh_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Tentinh> mp = new HashMap<>();
        int m = sc.nextInt();
        for(int i = 0;i < m; i++) {
            int mavung = sc.nextInt();
            sc.nextLine();
            String ten = sc.nextLine();
            int giacuoc = sc.nextInt();
            mp.put(mavung,new Tentinh(ten,giacuoc));
        }
        List<CuocGoi> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i =0 ;i < n; i++) {
            String a = sc.next(), b= sc.next(), c = sc.next();
            CuocGoi tmp = new CuocGoi(a,b,c);
//            System.out.println(a + "...." + b + "...." + c);
//            System.out.println(tmp);
            if(a.charAt(0) != '0') {
                tmp.tong = tmp.time * 800;
                tmp.ten = "Noi mang";
            }
            else {
                int mavung = Integer.parseInt(a.substring(1,3));
                Tentinh tmp2 = mp.get(mavung);
                tmp.ten = tmp2.ten;
                tmp.tong = tmp2.gia * tmp.time;
            }
            list.add(tmp);
        }
        Collections.sort(list, new Comparator<CuocGoi>() {
            public int compare(CuocGoi a, CuocGoi b) {
                return Long.compare(b.tong, a.tong);
            }
        });
        for(CuocGoi x :list) {
            System.out.println(x);
        }
    }
}
class CuocGoi{
    String ma,bdau,kthuc,dc,ten;
    long time,tong;
    CuocGoi(String a,String b,String c) {
        ma = a; bdau = b; kthuc = c;
        time = tinhtime();
        if(ma.charAt(0) != '0') time = (int)Math.ceil(time*1.0/3);
    }
    public int tinhtime(){
        String[] tmp1 = bdau.trim().split(":");
        String []tmp2  = kthuc.trim().split(":");
        int nho = 0;
        int phut = Integer.parseInt(tmp2[1]) - Integer.parseInt(tmp1[1]);
        if(phut < 0) {
            nho = 1; phut += 60;
        }
        int gio = Integer.parseInt(tmp2[0]) - Integer.parseInt(tmp1[0]) - nho;
        return gio * 60 + phut;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + time + " " + tong;
    }
}
class Tentinh{
    String ten;
    int gia;
    Tentinh(String a,int b) {
        ten = a; gia = b;
    }
//    @Override
//    public String toString() {
//        return ten + " " + gia;
//    }
}
