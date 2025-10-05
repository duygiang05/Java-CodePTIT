/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChuanHoaXauHoTenTrongFile;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true) {
            String t = sc.nextLine();
            if(t.compareTo("END") == 0) break;
            String []tmp = t.trim().split("\\s+");
            String ans = "";
            for(String x : tmp) {
                ans += (Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ");
            }
            System.out.println(ans.trim());
        }
    }
}
