/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TichMaTranVaChuyenViCuaNo;

/**
 *
 * @author PC
 */
import java.util.*;

public class TichMaTranVaChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}

class Matrix {
    int[][] a ;
    int row,column;
    Matrix (int a,int b) {
        this.a = new int[a][b];
        row = a ;column = b;
    }
    
    public void nextMatrix (Scanner sc ) {
        for(int i = 0 ;i < row; i ++) {
            for(int j = 0 ;j < column; j++) a[i][j] = sc.nextInt();
        }
    }
    
    public Matrix trans () {
        Matrix  b = new Matrix(column, row) ;
        for(int i = 0 ;i < row; i++) {
            for(int j = 0 ;j < column;j ++) {
                b.a[j][i] = this.a[i][j];
            }
        }
        return b;
    }
    public Matrix mul(Matrix b) {
        Matrix c = new Matrix(row,row);
        for(int i = 0 ;i < row; i ++) {
            for(int j = 0; j < row; j ++) {
                for(int k = 0; k < column; k++) {
                    c.a[i][j] += this.a[i][k] * b.a[k][j];
                }
            }
        }
        return c;
    }
    
    public String toString() {
        int [][] tmp = this.a;
        StringBuilder d = new StringBuilder();
        for(int i = 0; i < row; i ++) {
            for(int j = 0 ;j < column; j++) {
                d.append(tmp[i][j] + " " );
            }
            d.append("\n");
        }
        return d.toString().trim();
    }
}