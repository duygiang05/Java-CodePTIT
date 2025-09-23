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

public class DayConTangDan {

    private static boolean check(int[] x, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (x[i] > x[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void sinh(int[] a, int ind, int indx, int n, int[] x, List<String> ans) {
        if (ind >= n) {
            if (indx > 1 && check(x, indx)) {
                String tmp = "";
                for (int i = 0; i < indx; i++) {
                    tmp += Integer.toString(x[i]) + " ";
                }
                ans.add(tmp); 
            }
            return;
        }
        x[indx] = a[ind];
        sinh(a, ind + 1, indx + 1, n, x, ans);
        sinh(a, ind + 1, indx, n, x, ans);
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DAYSO.in");
        Scanner sc = new Scanner(f);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        List<String> ans = new ArrayList<>();
        sinh(a, 0, 0, n, x, ans);
        Collections.sort(ans);
        for(String it : ans) {
            System.out.println(it);
        }
    }
}
