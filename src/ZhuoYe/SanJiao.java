package ZhuoYe;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class SanJiao {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a =input.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if(i>=2){

                    if(j==1||j==2*i-1) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int f = 1; f <= (2*(a-i))-1; f++) {
                if(i<=a-1){

                   if(f==1||f==2*(a-i)-1) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }else {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }

    }

}
