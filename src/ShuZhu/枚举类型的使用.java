package ShuZhu;


public class 枚举类型的使用 {
    public enum Week{
    MON,TUE,WED,THU,FRL,SAT,SUN
    }

    /**
     * 查看日程安排
     * @param day 星期几
     */
    public void doWhat(Week day){
        switch(day){
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRL:
                System.out.println("工作日，努力写代码！");
                break;
            case SAT:
                System.out.println("星期六，休息！看电影！");
                break;
            case SUN:
                System.out.println("星期天，休息！打篮球！");
            default:
                System.out.println("地球上一个星期就7天！");
        }
    }
    public static void main(String[] age){
        枚举类型的使用 a =new 枚举类型的使用();
        a.doWhat(Week.THU);
        Week sat = Week.SAT;
        a.doWhat(sat);
    }
}
