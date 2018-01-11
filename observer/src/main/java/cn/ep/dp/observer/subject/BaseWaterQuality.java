package cn.ep.dp.observer.subject;

import cn.ep.dp.observer.WatcherObserver;

import java.util.*;

/**
 * 定义水质监测的目标对象
 *
 * @author lhl
 */
public abstract class BaseWaterQuality {

    /**
     * 定义保存注册的观察者对象
     */
    protected List<WatcherObserver> observers = new ArrayList<>();

    /**
     * 注册观察者对象
     *
     * @param observer 观察者对象
     */
    public void attach(WatcherObserver observer) {
        observers.add(observer);
    }

    /**
     * 通知相应的观者对象
     */
    public abstract void notifyWatchers();

    /**
     * 获取水质污染的级别
     *
     * @return 水质污染的级别
     */
    public abstract int getPolluteLevel();

}
