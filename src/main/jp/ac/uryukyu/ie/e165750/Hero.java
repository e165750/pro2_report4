package jp.ac.uryukyu.ie.e165750;

/**
 * Created by e165750 on 2016/11/21.
 */
public class Hero extends LivingThing {

    public Hero(String name, int maximumHP, int attack) {//コンストラクタ
        super(name,maximumHP,attack);//ここでスーパークラスからの継承を受けている
    }

    @Override //オーバーライドする事によってスーパークラスから継承したメソッドに上書きすることができる
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

}
