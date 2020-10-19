package ChiHuoLianMeng;

import java.util.*;

public class ZhengCai {
    Scanner input = new Scanner(System.in);
    Map<String,Cai> map = new HashMap<String, Cai>();
    Map<String,DianDanXingXi> Ymap = new HashMap();
    public  ZhengCai(){                     //初始化菜单


        Cai c = new Cai();
        c.setCaiName("红烧肉");
        c.setDianJian(28);
        c.setDianZhan(0);
        Cai c1 = new Cai("红烧鸡腿",20,0);
        Cai c2 = new Cai("宫保鸡丁",25,0);

        map.put("1",c);
        map.put("2",c1);
        map.put("3",c2);


    }
    public void Cai(int num){
        if(num==1){
            System.out.println("序号\t菜名\t单价\t点赞数");
            for (String Key:map.keySet()) {
                System.out.println(""+Key+"\t"+map.get(Key).getCaiName()+"\t"+map.get(Key).getDianJian()+"\t"+map.get(Key).getDianZhan());
            }
        }else {

            System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态");
            for (String Key:Ymap.keySet()) {
                System.out.println(""+Key+"\t"+Ymap.get(Key).getName()+"\t"+Ymap.get(Key).getZhongjie());
            }
        }
    }
    public void Ccai(){

        System.out.println("***我要订餐***");
        System.out.println("请输入订餐人的姓名：");
        String name = input.next();
        Cai(1);
        System.out.println("请选择您需要的菜品编号：");
        String id = input.next();

        System.out.println("请选择您需要的份数：");
        int age = input.nextInt();

        System.out.println("请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
        int Time = input.nextInt();

        System.out.println("请输入送餐地址：");
        String Di = input.next();

        System.out.println("订餐成功！");

        System.out.println("您定的是"+map.get(id).getCaiName()+""+age+"份");
        System.out.println("送产时间为"+Time+"点");
        System.out.println("餐费："+(map.get(id).getDianJian())*age+"元， 送餐费：0.0元，总计："+(map.get(id).getDianJian())*age);
        this.YonhuXX(id,name,map.get(id).getCaiName(),age,Time,Di,(map.get(id).getDianJian()*age));


    }

    public void YonhuXX(String id,String name,String CaiName,int age,int Time,String Di,double ZongJia){
        int i = 0;
//        System.out.println(age);
//        DianDanXingXi[] xx = new DianDanXingXi()[100];
//        DianDanXingXi x = new DianDanXingXi();
//        System.out.println(i+"__"+xx[i]+"___"+x+"___"+xx.length);
//        xx[i].setAge(age);
//        xx[i].setDi(Di);
//        xx[i].setName(name);
//        xx[i].setTime(Time);
//        xx[i].setCainame(CaiName);
//        xx[i].setZhongjie(ZongJia);

//        Ymap.put("1",);
        i++;
        Cai(0);

    }
}
