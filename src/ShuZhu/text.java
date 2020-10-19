package ShuZhu;
import java.util.*;

public class text {
    public static void main(String[] args) {

        int[][] a = new int[4][3];


        for (int i = 0; i < a.length; i++) {
            System.out.print("第" + (i + 1) + "季度:");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] =new Scanner(System.in).nextInt();
            }

            System.out.println();
        }


    }
}
