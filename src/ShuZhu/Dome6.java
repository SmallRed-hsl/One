package ShuZhu;

import java.util.Arrays;
import java.util.Scanner;

public class Dome6 {
    public static void main(String[] age) {
//        1、使用Arrays工具类Arrays.sort(数组名)升序排列一组字符char[] chars = {'a','c','u','b','e','p','f','z'}，并查找某个特殊字符在升序后数组中的位置(下标)。
        char[] chars = {'a','c','u','b','e','p','f','z'};
        Scanner input = new Scanner(System.in);
        Arrays.sort(chars);
//        for (char a : chars) {
//            System.out.print(a+"\t");
//        }
        System.out.println(Arrays.toString(chars));
        System.out.println("\n请输入：");
        String a =input.next();
        for (int i = 0; i < chars.length; i++) {
            if(a.charAt(0)==chars[i]){
                System.out.println(a+"在下标："+i);
            }
        }


    }
}
