package ShuZhu;

import ChiHuoLianMeng.ZhengCai;

import java.util.Arrays;
import java.util.Scanner;

public class Dome9 {

    public static void main(String[] args) {
//        对数组1、String[]names={"Angelia","Alice","tome","sam","Jack","Ruby",null,"Robin","Anne"};
//        进行增操作。
        String[]names={"Angelia","Alice","tome","sam","Jack","Ruby",null,"Robin","Anne"};
        Scanner input =new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                names[i]="new";
            }
        }
        System.out.println(Arrays.toString(names));

        String[]namesa={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
        Dome9 a =new Dome9();
        System.out.println("请选择1.删除2.修改3.查看");
        switch (input.nextInt()){
            case 1:

                a.San(namesa);
                break;
                case 2:

                a.XiuGai(namesa);
                break;
                case 3:

                a.ChaZhao(namesa);
                break;
        }
    }
    Scanner input =new Scanner(System.in);

    /**
     * 删除
     * @param namesa 姓名
     */
    public void San(String[] namesa){
//        String[]names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
//        分别进行删、改、查操作
        System.out.println("请输入要删除的名字;");
        String name =input.next();
        boolean bool = true;
        for (int i = 0; i < namesa.length; i++) {
                if(namesa[i].equals(name)){
                    namesa[i]=null;
                    bool = true;
                    break;
                }else{
                    bool = false;
                }
        }
        if(bool==false){
            System.out.println("未找到！");
        }else{
            System.out.println(Arrays.toString(namesa));
            System.out.println("已删除"+name);
        }
    }

    /**
     * 修改
     * @param namesa 姓名
     */
    public void XiuGai(String[] namesa){
        System.out.println("请输入要修改的名字;");
        String name =input.next();
        System.out.println("修改为：");
        String Newname =input.next();
        boolean bool = true;
        for (int i = 0; i < namesa.length; i++) {
            if(namesa[i].equals(name)){
                namesa[i]=Newname;
                bool = true;
                break;
            }else{
                bool = false;
            }
        }
        if(bool==false){
            System.out.println("未找到！");
        }else{
            System.out.println(Arrays.toString(namesa));
            System.out.println("已修改"+Newname);
        }
    }

    /**
     * 查找
     * @param nmaesa 姓名
     */
    public void ChaZhao(String[] nmaesa){
        System.out.println("输入姓名查看是否存在：");
        String name =input.next();
        boolean bool = true;
//        for (int i = 0; i < nmaesa.length; i++) {
//           if(name.equals(nmaesa[i])){
//               bool=true;
//               break;
//           }else{
//               bool=false;
//           }
//        }
        Arrays.sort(nmaesa);

        if( Arrays.binarySearch(nmaesa,name)>-1){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }
//        if(bool==true){
//            System.out.println("存在");
//        }else{
//            System.out.println("不存在");
//        }
        System.out.println(Arrays.toString(nmaesa));
    }
}
