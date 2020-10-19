package ZhuoYe;

public class ZouYe5 {
    public static void main(String[] args) {
//        5、使用for循环输出100~1000之间所有水仙花数。
//        所谓水仙花数就是一个三位数，它各位的立方之和加起来的数值等于本身，
//        比如说，153,   153 = 1 + 125 + 27

        for (int i = 100; i < 1000; i++) {
            int a = i/100;
            int b = i%100/10;
            int c = i%100%10;
            if(i==((int)Math.pow(a,3)+(int)Math.pow(b,3)+(int)Math.pow(c,3))){
                System.out.println(i);
            }

        }


    }
}
