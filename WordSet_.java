/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class WordSet_ {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet {

    TreeSet<String> s;

    WordSet(String s) {
        this.s = new TreeSet<>();
        String[] x = s.trim().toLowerCase().split("\\s+");
        this.s.addAll(Arrays.asList(x));
    }
    
    public WordSet union(WordSet b) {
        TreeSet tmp = new TreeSet<>(this.s);
        tmp.addAll(b.s);
        WordSet ans = new WordSet("");
        ans.s = tmp;
        return ans;
    }
    public WordSet intersection(WordSet b) {
        TreeSet tmp = new TreeSet<>(this.s);
        tmp.retainAll(b.s);
        WordSet ans = new WordSet("");
        ans.s = tmp;
        return ans;
    }
    
    @Override
    public String toString() {
        StringBuilder d = new StringBuilder();
        for (String item : this.s) {
            d.append(item).append(" ");
        }
        d.append("\n");
        return d.toString().trim();
    }
}
