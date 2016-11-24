package jp.ac.uryukyu.ie.e165750;

/**
 * Created by e165750 on 2016/11/21.
 */
public class Enemy extends LivingThing {

    public Enemy(String name, int maximumHP, int attack) {//コンストラクタ
        super(name,maximumHP,attack);//ここでスーパークラスからの継承を受けている
    }


    @Override //オーバーライドする事によってスーパークラスから継承したメソッドに上書きすることができる
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }


}
