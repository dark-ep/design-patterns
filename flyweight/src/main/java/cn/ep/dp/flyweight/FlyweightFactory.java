package cn.ep.dp.flyweight;

import cn.ep.dp.flyweight.impl.AuthorizationFlyweight;

import java.util.*;

/**
 * 享元工厂
 *
 * @author lhl
 */
public class FlyweightFactory {

    private static FlyweightFactory factory = new FlyweightFactory();
    /**
     * 缓存多个Flyweight对象
     */
    private Map<String, Flyweight> fsMap = new HashMap<>();

    private FlyweightFactory() {

    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    /**
     * 获取key对应的享元对象
     *
     * @param key key
     * @return 对象
     */
    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = fsMap.get(key);
        if (flyweight == null) {
            flyweight = new AuthorizationFlyweight(key);
            fsMap.put(key, flyweight);
        }
        return flyweight;
    }

}
