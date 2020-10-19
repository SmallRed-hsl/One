package ShuZhu;

import java.util.Arrays;

public class Dome5 {
    public static void main(String[] age){
//        3. int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3}; 数组去重
        int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};

        int a = 0;
//        int[] arr22 =Arrays.copyOf(arr11,arr11.length);
//
//
//        int[] num =new int[arr11.length];
        for (int i = 0; i < arr11.length; i++) {

            for (int j = i+1; j < arr11.length; j++) {
                if(arr11[i]==arr11[j]){
                    arr11[j]=-1;

                }
            }
            System.out.print(arr11[i]);

        }
        for (int i = 0; i < arr11.length; i++) {
            if(arr11[i]!=-1){
               a++;
            }

        }
        System.out.println("\n"+a);
        int[] arr22 = new int[a];
        int o = 0;
        for (int i = 0; i < arr11.length; i++) {
            if(arr11[i]!=-1){
                arr22[o]=arr11[i];
                o+=1;
            }

        }
        for (int i:
             arr22) {
            System.out.print(i+"\t");

        }
    }
}
