package com.haust;

public class Flighter extends Weapon{
    @Override
    public void move() {
        System.out.println("飞机在移动");
    }
    @Override
    public void attack() {
        System.out.println("飞机在攻击");
    }
}
