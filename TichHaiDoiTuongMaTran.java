/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TichHaiDoiTuongMaTran;

/**
 *
 * @author PC
 */
import java.util.*;

public class TichHaiDoiTuongMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}

class Matrix {
    int [][] a;
    int row,column;
    Matrix (int a,int b) {
        row = a; column = b;
        this.a = new int[a][b];
    }
    public void nextMatrix (Scanner sc) {
        for(int i = 0; i < row;i ++) {
            for(int j = 0; j < column ;j ++) a[i][j] = sc.nextInt();
        }
    }
    
    public Matrix mul(Matrix b) {
        int p = b.column, q = this.row;
        Matrix c = new Matrix(q, p);
        for(int i = 0 ;i < q ;i ++) {
            for(int j = 0; j < p ;j ++) {
                for(int k = 0 ;k < b.row; k ++) {
                    c.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return c;
    }
    
    public String toString() {
        int[][] tmp = this.a;
        StringBuilder d = new StringBuilder();
        for(int i = 0 ; i < this.row; i ++) {
            for(int j = 0 ;j < column; j++) {
                d.append(a[i][j] + " ");
            }
            d.append("\n");
        }
        return d.toString().trim();
    }
}
