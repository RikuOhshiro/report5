package jp.ac.uryukyu.ie.e195763;

/**
 * 生物クラス。
 *  String name; //生物の名前
 *  int hitPoint; //生物のHP
 *  int attack; //生物の攻撃力
 *  boolean dead; //生物の生死状態。true=死亡。
 * Created by e195763 on 2019/12/24.
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public LivingThing (String name, int maximumHP, int attack) {
        setName(name);
        setHitPoint(maximumHP);
        setAttack(attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     * @return boolean
     */
    public boolean isDead(){
        return  dead;
    }

    /**
     * 生物の名前をゲットするgetterメソッド。
     * @return  name
     */
    public String getName(){
        return name;
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(LivingThing e) {
        int damage = (int) (Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 1 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    /**
     * 生物の名前をセットするsetterメソッド。
     * @param name 生物の名前
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 生物の体力をセットするsetterメソッド。
     * @param h 生物の体力
     */
    public void setHitPoint(int h) {
        this.hitPoint = h;
    }
    /**
     * 生物の攻撃力をセットするsetterメソッド。
     * @param a 生物の攻撃力
     */
    public void setAttack(int a) {
        this.attack = a;
    }
    /**
     * 生物の生死をセットするsetterメソッド。
     * @param b 生ならfalse、死ならtrue
     */
    public void setDead(boolean b) {
        this.dead = b;
    }
    /**
     * 生物の体力をゲットするgetterメソッド。
     * @return int
     */
    public int getHitPoint() {
        return hitPoint;
    }
}
