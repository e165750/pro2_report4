package jp.ac.uryukyu.ie.e165750;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e165750 on 2016/11/22.
 */
public class EnemyTest {
    @Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.dead = true;
        for (int i = 0; i < 10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。

        }
        assertEquals(heroHP, hero.hitPoint);
    }
}