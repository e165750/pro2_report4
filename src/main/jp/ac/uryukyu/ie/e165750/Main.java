package jp.ac.uryukyu.ie.e165750;

/**
 * Created by e165750 on 2016/11/21.
 */
public class Main {
    /**
     * Created by tnal on 2016/11/13.
     */

    public static void main(String[] args) {
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while (hero.isDead() == false && enemy.isDead() == false) {
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);//最初で作ったコンストラクタにより、hero.メソッド名で関数の呼び出しをすることができる
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }

}
