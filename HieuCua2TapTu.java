/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HieuCua2TapTu;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class HieuCua2TapTu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
class WordSet{
    Set<String> s = new TreeSet<>();
    WordSet(String namefile) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(namefile));
        while(sc.hasNext()) {
            this.s.add(sc.next().toLowerCase());
        }
    }
    public WordSet difference(WordSet other) {
        Set<String> temp = new TreeSet<>(this.s);
        temp.removeAll(other.s);
        return new WordSet(temp);
    }
    
    WordSet(Set<String> s) {
        this.s = s;
    }
    @Override
    public String toString() {
        for(String x : this.s) {
            System.out.print(x + " ");
        }
        return "";
    }
}
