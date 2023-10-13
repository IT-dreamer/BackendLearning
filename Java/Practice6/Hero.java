package Java.Practice6;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    int deathCount;
    int killCount;
    int assistantCount;
    int money;
    int kick;
    String afterKilledSaid;
    String afterKillSaid;

    void hurtTeammate()
    {
        System.out.println("太坑了！！！！");
    }

    public float getArmor()
    {
        return this.armor;
    }

    public void addSpeed(int speed)
    {
        this.moveSpeed += speed;
    }

    public void legendary()
    {
        System.out.println("超神！！！！");
    }

    public float getHp()
    {
        return this.hp;
    }

    public void recovery(float blood)
    {
        this.hp += blood;
    }
}
