package jp.ac.uryukyu.ie.e165750;

/**
 * Created by e165750 on 2016/11/23.
 */
public class LivingThing {//これはスーパークラス（親クラス）にあたる
    /**
     * スーパークラス。
     * String name; //敵の名前
     * int hitPoint; //敵のHP
     * int attack; //敵の攻撃力
     * boolean dead; //敵の生死状態。true=死亡。
     * Created by tnal on 2016/11/13.
     */
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name, int maximumHP, int attack) {
        /**
         * コンストラクタ。名前、最大HP、攻撃力を指定する。
         *
         * @param name      それぞれの名前
         * @param maximumHP それぞれのHP
         * @param attack    それぞれの攻撃力
         */
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    /**
     * getterメソッドと同等。生死をboolean表現しているためメソッド名をisDead()とした。
     *
     * @return boolean
     */

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    /**
     * 攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     *
     * opponent:敵
     */
    public void attack(LivingThing opponent) {
        int damage;
        if (dead == false) {
            damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        } else {
            damage = 0;
        }
        opponent.wounded(damage);

    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     *
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
        }
    }
}
