import java.util.*;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<tiendien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            long socu = Long.parseLong(sc.nextLine());
            long somoi = Long.parseLong(sc.nextLine());
            list.add(new tiendien(s, socu, somoi));
        }
        
        for(tiendien x : list) {
            System.out.println(x);
        }
    }
}

class tiendien {
    String ma, stt;
    public static int dem = 1;
    long socu, somoi, heso, thanhtien, phutroi, tong;
    
    tiendien(String a, long x, long y) {
        stt = String.format("KH%02d", dem++);
        ma = a; 
        socu = x; 
        somoi = y;
        
        if(ma.equals("KD")) heso = 3;
        else if(ma.equals("NN")) heso = 5;
        else if(ma.equals("TT")) heso = 4;
        else heso = 2;
        
        long diff = somoi - socu;
        thanhtien = diff * heso * 550;
        
        // Tính phụ trội bằng công thức làm tròn thủ công
        if(diff > 100) {
            phutroi = thanhtien;
        } else if(diff >= 50) {
            // thanhtien * 35 / 100 để tránh số thực
            phutroi = (thanhtien * 35 + 50) / 100; // Làm tròn
        } else {
            phutroi = 0;
        }
        
        tong = thanhtien + phutroi;
    }
    
    @Override
    public String toString() {
        return stt + " " + heso + " " + thanhtien + " " + phutroi + " " + tong;
    }
}