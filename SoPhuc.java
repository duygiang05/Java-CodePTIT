/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.*;

public class SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            sophuc_ a = new sophuc_() , b = new sophuc_();
            a.nhap(sc); b.nhap(sc);
            sophuc_ c = a.cong(b);
            System.out.print(c.nhan(a) + ", ");
            System.out.println(c.nhan(c));
        }
    }
}
class sophuc_ {
    int thuc,ao;
    public void nhap(Scanner sc) {
        thuc = sc.nextInt();
        ao = sc.nextInt();
    }
    @Override
    public String toString() {
        StringBuilder d = new StringBuilder();
        d.append(thuc + " ");
        if(ao > 0) d.append("+ " + ao +"i");
        else d.append("- " + (ao * (-1)) + "i");
        return d.toString().trim();
    }
    public sophuc_ cong(sophuc_ b) {
        sophuc_ c = new sophuc_();
        c.thuc = this.thuc + b.thuc;
        c.ao = this.ao + b.ao;
        return c;
    }
    
    public sophuc_ nhan (sophuc_ b) {
        sophuc_ c = new sophuc_ ();
        c.thuc = this.thuc * b.thuc - this.ao * b.ao;
        c.ao = this.thuc * b.ao + this.ao * b.thuc;
        return c;
    }
}
