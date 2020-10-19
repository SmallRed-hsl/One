package text;

public class Dome1 {
    public static void main(String[] args) {
        int lenth =10;
        int[][] arr =new int[lenth][lenth];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
