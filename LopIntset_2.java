/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopIntset_2;

/**
 *
 * @author PC
 */
import java.io.File;
import java.io.IOException;
import java.util.*;

public class LopIntset_2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
class IntSet {
    ArrayList<Integer> a;

    public IntSet(int[] a ) {
        this.a = new ArrayList();
        Arrays.sort(a);
        int tmp = -1;
        for(int i = 0 ; i < a.length; i++) {
            if(tmp < a[i]) {
                this.a.add(a[i]); tmp = a[i];
            }
        }
    }
    public IntSet ( ArrayList<Integer> a) {
        this.a = a;
    }
    public IntSet intersection(IntSet b) {
        ArrayList<Integer> c = new ArrayList<>();
        int l = 0, r = 0;
        while(l < this.a.size() && r < b.a.size()) {
            if(this.a.get(l) < b.a.get(r) ) l ++;
            else if(this.a.get(l) > b.a.get(r) ) r ++;
            else {
                c.add(this.a.get(l)); r ++; l ++;
            }
        }
        IntSet ans = new IntSet(c);
        return ans;
    }
    public String toString() {
        StringBuilder d = new StringBuilder();
        ArrayList<Integer> tmp = this.a;
        for(int i = 0; i < tmp.size(); i++) {
            d.append(this.a.get(i) + " " );
        }
        d.append("\n");
        return d.toString().trim();
    }
}