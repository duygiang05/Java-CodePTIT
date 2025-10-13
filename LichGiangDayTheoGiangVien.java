/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LichGiangDayTheoGiangVien;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class LichGiangDayTheoGiangVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Map<String,String> mp = new HashMap<>();
        List<lich> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String ma = sc.nextLine(), ten = sc.nextLine();
            mp.put(ma,ten);
            int sotin = sc.nextInt();
        }
        sc.close();
        sc = new Scanner(new File("LICHGD.in"));
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < m; i++) {
            String ma = sc.nextLine();
            int thu = sc.nextInt(), kip = sc.nextInt();
            sc.nextLine();
            String ten = sc.nextLine(), phonghoc = sc.nextLine();
            list.add(new lich(ma,ten,phonghoc,thu,kip));
        }
        Collections.sort(list,new Comparator<lich>() {
            public int compare(lich a, lich b) {
                if(a.thu != b.thu) return a.thu - b.thu;
                else if(a.kip != b.kip ) return a.kip - b.kip;
                return a.ten.compareTo(b.ten);
            } 
        });
        String s = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + s + ":");
        for(lich x : list) {
            String tmp = mp.get(x.mamon);
            x.tenmon = tmp;
            if(x.ten.equals(s)) System.out.println(x);
        }
//        mp.forEach((a,b)->{
//            System.out.println(a + "\n" + b);
//        });
    }
}
class lich{
    String manhom,mamon,ten,phonghoc,tenmon;
    int thu,kip;
    public static int dem = 1;
    lich(String a,String b,String c,int d,int e) {
        mamon = a; ten = b; phonghoc = c; thu = d; kip = e;
        manhom = String.format("HP%03d",dem++);
    }
    @Override
    public String toString(){
        return manhom + " " +tenmon + " " + thu + " " + kip + " " + phonghoc; 
    }
} 
