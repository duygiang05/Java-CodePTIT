/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HopVaGiaoCua2FileVanBan;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
public class HopVaGiaoCua2FileVanBan {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
class WordSet{
    Set<String> s = new TreeSet<>();
    WordSet(String namefile) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(namefile));
        while(sc.hasNext()) {
            this.s.add(sc.next().toLowerCase());
        }
        sc.close();
    }
    WordSet(Set<String> temp) {
        this.s = temp;
    }
    
    public WordSet union(WordSet other){
        Set<String> temp = new TreeSet<>(this.s);
        temp.addAll(other.s);
        return new WordSet(temp);
    }
    public WordSet intersection(WordSet other) {
        Set<String> temp = new TreeSet<>(this.s);
        temp.retainAll(other.s);
        return new WordSet(temp);
    }
    
    @Override
    public String toString() {
        for(String x : this.s) {
            System.out.print(x + " ");
        }
        return "";
    }
}