package jp.ac.uryukyu.ie.e195763;

public class Enemy extends LivingThing {

    int h = getHitPoint();
    boolean b = isDead();
    String n = getName();

    public Enemy (String name, int maximumHP, int attack) {
        super(name ,maximumHP ,attack);
    }

    @Override
    public void wounded(int damage){
        h -= damage;
        if( h < 1 ) {
            b = true;
            System.out.printf("モンスター%sは倒れた。\n", n);
        }
    }
}