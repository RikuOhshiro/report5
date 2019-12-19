package jp.ac.uryukyu.ie.e195763;

public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.b == false && enemy.b == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            if (!hero.b){
                hero.attack(enemy);
            }
            if (!enemy.b){
                enemy.attack(hero);
            }
        }
        System.out.println("戦闘終了");
    }
}
