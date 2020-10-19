package QuickHit;


// 玩家类
public class Player
{
    private int levelNo=1;
    private int currScore;
    private long startTime;
    private int elapsedTime;
    public void play()
    {
        Game game=new Game();
        game.run();
        System.out.println("通关");
    }

    public int getLevelNo()
    {
        return levelNo;
    }

    public void setLevelNo(int levelNo)
    {
        this.levelNo = levelNo;
    }

    public int getCurrScore()
    {
        return currScore;
    }

    public void setCurrScore(int currScore)
    {
        this.currScore = currScore;
    }

    public long getStartTime()
    {
        return startTime;
    }

    public void setStartTime(long startTime)
    {
        this.startTime = startTime;
    }

    public int getElapsedTime()
    {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime)
    {
        this.elapsedTime = elapsedTime;
    }
}
