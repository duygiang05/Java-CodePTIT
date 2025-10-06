/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuanHoaVaSapXep;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class ChuanHoaVaSapXep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<ten> list = new ArrayList<>();
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            list.add(new ten(s));
        }
        Collections.sort(list,new Comparator<ten>() {
            public int compare(ten a,ten b) {
                if(!a.ten.equals(b.ten)) return a.ten.compareTo(b.ten);
                else if(!a.ho.equals(b.ho)) return a.ho.compareTo(b.ho);
                return a.dem.compareTo(b.dem);
            }
        });
        for(ten x : list) {
            System.out.println(x);
        }
    }
}
class ten{
    String ho="",ten="",dem="";
    ten(String s) {
        String [] tmp = s.trim().split("\\s+");
        ho = tmp[0].substring(0,1).toUpperCase() + tmp[0].substring(1).toLowerCase();
        for(int i = 1;i < tmp.length - 1; i++) {
            dem += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1).toLowerCase() + " ";
        }
        dem = dem.trim();
        ten = tmp[tmp.length - 1].substring(0,1).toUpperCase() + tmp[tmp.length - 1].substring(1).toLowerCase();
    } 
    @Override
    public String toString () {
        return ho + " " + dem +  " " + ten;
    }
}
