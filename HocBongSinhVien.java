/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocBongSinhVien;

/**
 *
 * @author PC
 */
import java.util.*;

public class HocBongSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String a = sc.nextLine();
            double x = sc.nextDouble();
            int y = sc.nextInt();
            list.add(new SinhVien(a, x, y));
        }
        List<SinhVien> tmp = new ArrayList<>(list);
        Collections.sort(tmp, new Comparator<SinhVien>(){
            public int compare(SinhVien a, SinhVien b) {
                return Double.compare(b.gpa, a.gpa);
            } 
        });
        double diem = 0;
        for (SinhVien x : tmp) {
            if (m > 0) {
                if (x.gpa >= 3.6 && x.drl >= 90) {
                    x.tt = "XUATSAC";
                } else if (x.gpa >= 3.2 && x.drl >= 80) {
                    x.tt = "GIOI";
                } else if (x.gpa >= 2.5 && x.drl >= 70) {
                    x.tt = "KHA";
                } else {
                    x.tt = "KHONG";
                }
                diem = x.gpa;
                m--;
            } 
            else {
                if (x.gpa == diem) {
                    if (x.drl >= 90) {
                        x.tt = "XUATSAC";
                    } else if (x.drl >= 80) {
                        x.tt = "GIOI";
                    } else if (x.drl >= 70) {
                        x.tt = "KHA";
                    } else {
                        x.tt = "KHONG";
                    }
                }
                else x.tt = "KHONG";
            }
        }
        for(SinhVien x : list) {
            for(SinhVien y : tmp) {
                if(x.ten.compareTo(y.ten) == 0 && x.drl == y.drl && Double.compare(x.gpa, y.gpa) == 0) {
                    x.tt = y.tt ; break;
                }
            }
        }
        for(SinhVien x :list) {
            System.out.println(x);
        }
    }
}
class SinhVien {

    String ten, tt;
    double gpa;
    int drl;

    SinhVien(String a, double b, int c) {
        ten = a;
        gpa = b;
        drl = c;
    }

    @Override
    public String toString() {
        return ten + ": " + tt;
    }
}
