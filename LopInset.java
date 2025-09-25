/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */

import java.util.*;

public class LopInset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
class IntSet {
    List<Integer> a ;
    public IntSet(){}
    public IntSet (int[] x) {
        Arrays.sort(x);
        this.a = new ArrayList<>();
        int tmp = -1;
        for(int i : x) {
            if(tmp < i) {
                a.add(i); tmp = i;
            }
        }
    }
    public IntSet union (IntSet b) {
        List<Integer> x = this.a, y = b.a,ans = new ArrayList<>();
        int l = 0, r = 0;
        while(l < x.size() && r < y.size()) {
            if(x.get(l) < y.get(r)) {
                ans.add(x.get(l)); l ++;
            } 
            else if(x.get(l) > y.get(r)) {
                ans.add(y.get(r)); r ++;
            }
            else {
                ans.add(x.get(l)) ; r++; l++;
            }
        }
        while(l < x.size()) {
            ans.add(x.get(l)); l++;
        }
        while(r < y.size()){
            ans.add(y.get(r)); r ++;
        }
        int [] d = ans.stream().mapToInt(Integer :: intValue).toArray();
        IntSet c = new IntSet(d);
        return c;
    }
    
    public String toString() {
        List<Integer> tmp = this.a;
        String x = "";
        for(int i = 0 ; i < tmp.size(); i ++) {
            x += Integer.toString(tmp.get(i)) + " ";
        }
        return x.trim();
    }
}