package ChiHuoLianMeng;

public class DianDanXingXi {
    private String name; //用户姓名
    private String Cainame; //菜品信息
    private int age;  //几份
    private int time; //送餐时间
    private String Di; //送餐地址

    private double Zhongjie;  //总价
    private int bool;       //订单状态 0 -1 预定中
    public DianDanXingXi(){

    }
    public DianDanXingXi(String name,String Cainame,int age,int time,String Di,double Zhongjie,int bool){
        this.age = age;
        this.name = name;
        this.bool = bool;
        this.Cainame = Cainame;
        this.Di = Di;
        this.Zhongjie =Zhongjie;
        this.time = time;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCainame() {
        return Cainame;
    }

    public void setCainame(String cainame) {
        Cainame = cainame;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDi() {
        return Di;
    }

    public void setDi(String di) {
        Di = di;
    }

    public double getZhongjie() {
        return Zhongjie;
    }

    public void setZhongjie(double zhongjie) {
        Zhongjie = zhongjie;
    }

    public int getBool() {
        return bool;
    }

    public void setBool(int bool) {
        this.bool = bool;
    }

}
