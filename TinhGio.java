/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhGio;

/**
 *
 * @author PC
 */
import java.util.*;

public class TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        giochoi[] a = new giochoi[n];
        for(int i = 0 ; i < n; i++) {
            a[i] = new giochoi();
            a[i].nhap(sc);
        }
        List<giochoi> list = Arrays.asList(a);
        Collections.sort(list, new sapxep());
        for(int i = 0 ; i < n; i ++) {
            System.out.println(list.get(i));
        }
    }
}
class giochoi{
    String ma,ten,giophutra,giophutvao;
    int giochech,phutchech;
    public void nhap(Scanner sc) {
        ma = sc.nextLine();
        ten = sc.nextLine();
        giophutvao = sc.nextLine();
        giophutra = sc.nextLine();
        tinhtoan();
    }
    public void tinhtoan () {
        int giovao = Integer.parseInt(this.giophutvao.substring(0,2));
        int giora = Integer.parseInt(this.giophutra.substring(0,2));
        int phutvao = Integer.parseInt(this.giophutvao.substring(3));
        int phutra = Integer.parseInt(this.giophutra.substring(3));
        phutchech = phutra - phutvao;
        giochech = giora - giovao;
        if(phutra < phutvao) {
            giochech --; phutchech += 60;
        }
    }
    @Override
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(ma + " " + ten + " " + this.giochech + " gio " + this.phutchech + " phut" );
        return d.toString().trim();
    }
}

class sapxep implements Comparator<giochoi> {
    @Override
    public int compare(giochoi a, giochoi b) {
        if(a.giochech != b.giochech ) return b.giochech - a.giochech;
        return b.phutchech - a.phutchech;
    }
}
