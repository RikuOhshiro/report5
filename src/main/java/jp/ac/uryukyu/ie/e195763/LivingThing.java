package jp.ac.uryukyu.ie.e195763;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing (String name, int maximumHP, int attack) {
        setName(name);
        setHitPoint(maximumHP);
        setAttack(attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
        return  dead;
    }

    public String getName(){
        return name;
    }

    public void attack(LivingThing e) {
        int damage = (int) (Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 1 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHitPoint(int h) {
        this.hitPoint = h;
    }
    public void setAttack(int a) {
        this.attack = a;
    }
    public void setDead(boolean b) {
        this.dead = b;
    }
    public int getHitPoint() {
        return hitPoint;
    }
}
