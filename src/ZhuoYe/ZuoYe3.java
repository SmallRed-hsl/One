package ZhuoYe;

public class ZuoYe3 {
    public static void main(String[] args) {
//        3、本金10000元存入银行，年利率是千分之三。每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少

        double beng = 10000;
        double lilu = 0.003;
        double num = beng*lilu;

        for (int i = 0; i < 5; i++) {

            beng = num+beng;

            num = beng*lilu;

        }
        System.out.println(beng);
    }
}
