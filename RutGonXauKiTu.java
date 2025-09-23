import java.util.*;

public class RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int i = 0;
        while (i < sb.length() - 1) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.delete(i, i + 2); 
                if (i > 0) i--;     
            } else {
                i++;
            }
        }

        if (sb.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(sb.toString());
        }
    }
}