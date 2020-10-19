package QuickHit;

import java.util.Random;

//游戏类
import java.util.*;

public class Game implements LeveIParam
{
    Player player=new Player();

    public String printStr()
    {
        String str="";
        for (int i = 0; i < LEVELS[player.getLevelNo() - 1].getStrLength(); i++)
        {
            str+=(int)(Math.random()*10);
        }
        return str;
    }

    public void printResult(String out,String in)
    {
        if ((System.currentTimeMillis()-player.getStartTime())/1000>LEVELS[player.getLevelNo()-1].getTimeLimit())
        {
            System.out.println("输入超时");
            System.exit(-1);
        }
        if (!out.equals(in))
        {
            System.out.println("输入错误");
            System.exit(-1);
        }
        player.setElapsedTime((int)(System.currentTimeMillis()-player.getStartTime())/1000);
        player.setCurrScore(player.getCurrScore()+LEVELS[player.getLevelNo()-1].getPerScore());
        System.out.println("输入正确，您的积分"+player.getCurrScore()+
                "，您的级别"+player.getLevelNo()+"，已用时间"+player.getElapsedTime());
    }
    public void run()
    {
        player.setStartTime(System.currentTimeMillis());
        Scanner input=new Scanner(System.in);
        for (int i = player.getLevelNo()-1; i < LEVELS.length; i++)
        {
            for (int i1 = 0; i1 < LEVELS[player.getLevelNo() - 1].getStrTimes(); i1++)
            {
                String out=printStr();
                System.out.println(out);
                String in=input.next();
                printResult(out,in);
            }
            player.setLevelNo(player.getLevelNo()+1);
        }
    }
}
