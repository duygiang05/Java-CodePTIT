/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoKhacNhauTrongFile_1;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class SoKhacNhauTrongFile_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> mp = new TreeMap<>();
        while(sc.hasNextInt()){
            int tmp = sc.nextInt();
            mp.put(tmp, mp.getOrDefault(tmp,0) + 1);
        }
        sc.close();
        mp.forEach((u,v)->{
            System.out.println(u + " "+ v);
        });
    }
}
