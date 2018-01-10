package cn.ep.dp.decorator.impl;

import cn.ep.dp.decorator.BaseComponent;

import java.util.Date;

/**
 * 基本的实现计算奖金的类，也是被装饰器装饰的对象
 *
 * @author lhl
 */
public class ConcreteBaseComponent extends BaseComponent {

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //只是一个默认的实现，默认没有奖金
        return 0;
    }
}
