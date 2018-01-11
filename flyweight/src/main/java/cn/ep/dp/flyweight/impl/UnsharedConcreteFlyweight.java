package cn.ep.dp.flyweight.impl;

import cn.ep.dp.flyweight.Flyweight;

import java.util.*;

/**
 * @author lhl
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    private List<Flyweight> list = new ArrayList<>();

    @Override
    public boolean match(String securityEntity, String permit) {
        for (Flyweight flyweight : list) {
            if (flyweight.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Flyweight flyweight) {
        list.add(flyweight);
    }

}
