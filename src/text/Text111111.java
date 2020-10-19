package text;

public class Text111111 {
    public static void main(String[] age){
        int [] a = new int[]{1,2,5,3,4};
        for(int i = 1 ; i <= 9; i++){
            for(int j = 1 ; j <= i ;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }

        for(int i = 0 ; i<a.length-1;i++){
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    int num =a[j];
                    a[j]=a[j+1];
                    a[j+1]=num;
                }
            }
        }
        for (int f :
             a) {
            System.out.println(f);
        }

    }

}
