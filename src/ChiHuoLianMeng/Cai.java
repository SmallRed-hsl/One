package ChiHuoLianMeng;

public class Cai {
   private String CaiName;
    private double DianJian;
    private int  DianZhan;
    public Cai(){}
    public Cai(String CaiName,int DianJian,int DianZhan){
        this.CaiName = CaiName;
        this.DianJian = DianJian;
        this.DianZhan = DianZhan;
    }
    public String getCaiName() {
        return CaiName;
    }

    public void setCaiName(String caiName) {
        CaiName = caiName;
    }

    public double getDianJian() {
        return DianJian;
    }

    public void setDianJian(int dianJian) {
        DianJian = dianJian;
    }

    public int getDianZhan() {
        return DianZhan;
    }

    public void setDianZhan(int dianZhan) {
        DianZhan = dianZhan;
    }


}
