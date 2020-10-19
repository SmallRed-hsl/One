package ChiHuoLianMeng;

import java.util.*;
import java.util.Map;

public class Text {
    public static void main(String[] args) {
//        Map<String,Cai> map = new HashMap<String, Cai>();
//        Cai c = new Cai();
//        c.setCaiName("红烧肉");
//        c.setDianJian(28);
//        c.setDianZhan(0);
//        map.put("1",c);
//        for(String Key:map.keySet()) {
//            System.out.println(":"+Key+":"+map.get(Key).getCaiName()+":"+map.get(Key).getDianJian());
//        }
//        ZhengCai Zg = new ZhengCai();
//        Zg.Ccai("2",2);
//        GengNeng gn = new GengNeng();
//        gn.GN1();
       CaiDan cd = new CaiDan();

        int bool = 0;
       do{
             bool =cd.cd();

       }while(bool==0);

    }
}
