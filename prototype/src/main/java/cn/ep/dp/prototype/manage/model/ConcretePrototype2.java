package cn.ep.dp.prototype.manage.model;

import cn.ep.dp.prototype.manage.Prototype;

/**
 * 克隆的具体实现对象
 *
 * @author lhl
 */
public class ConcretePrototype2 implements Prototype {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype2 prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        return prototype;
    }

    @Override
    public String toString() {
        return "Now in Prototype2，name=" + name;
    }

}