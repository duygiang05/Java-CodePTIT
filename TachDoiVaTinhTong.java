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
import java.math.BigInteger;
import java.util.*;

public class TachDoiVaTinhTong {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        String s = sc.nextLine().trim();
        while (s.length() > 1) {
            int tmp = s.length() / 2;
            String a = s.substring(0, tmp);
            String b = s.substring(tmp);
            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);
            s = A.add(B).toString();
            System.out.println(s);
        }

    }
}
