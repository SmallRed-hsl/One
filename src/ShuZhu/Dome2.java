package ShuZhu;

public class Dome2 {
    public static void main(String[] age) {
//        2. 定义一个数组int[] nums={8,7,3,9,5,4,1}
//        输出数组中的最大值和最大值所在的下标
        int[] nums = {8, 7, 3, 9, 5, 4, 1};
        int max = 0;

        int a = 0;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]>max){
                max = nums[i];
                a=i;
           }


        }
        System.out.println("最大："+max+"："+a);
    }

}
