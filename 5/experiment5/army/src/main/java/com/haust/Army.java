package com.haust;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Army {
    Set<Weapon> set=new HashSet<Weapon>();
    public Set<Weapon> getSet() {
        return set;
    }
    public void setSet(Set<Weapon> set) {
        this.set = set;
    }
    public void attackall()
    {
        Iterator<Weapon> it=set.iterator();
        while(it.hasNext())
        {
            Weapon weapon=it.next();
            weapon.attack();
            weapon.move();
        }
    }
}
