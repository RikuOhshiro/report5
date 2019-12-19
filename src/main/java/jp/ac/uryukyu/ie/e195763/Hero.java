package jp.ac.uryukyu.ie.e195763;

public class Hero extends LivingThing {

    int h = getHitPoint();
    boolean b = isDead();
    String n = getName();

    public Hero (String name, int maximumHP, int attack) {
        super(name ,maximumHP ,attack);
    }

    @Override
    public void wounded(int damage){
        h -= damage;
        if( h < 1 ) {
            b = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", n);
        }
    }
}