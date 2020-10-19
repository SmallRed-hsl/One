package ShuZhu;

import java.util.Random;

public class Dome8 {
    public static void main(String[] args) {
        String str = "abcdefghijklmeopqrstuvwxyzABCDEFGHIJKLMEOPQRSTUVWXYZ1234567890";
        Random rand =new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 10; i++) {
            sb.append(str.charAt(rand.nextInt(62)));
    }
        System.out.println(sb);
    }
}
