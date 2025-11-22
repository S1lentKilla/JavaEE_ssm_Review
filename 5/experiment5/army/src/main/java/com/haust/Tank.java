package com.haust;

public class Tank extends Weapon{
    @Override
    public void move() {
        System.out.println("坦克在移动");
    }
    @Override
    public void attack() {
        System.out.println("坦克在攻击");
    }
}
