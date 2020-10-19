package text;

public class _示例10 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i%4==0){
                break;
            }
            System.out.println("i="+i);
        }
        System.out.println("循环结束");
    }
}
