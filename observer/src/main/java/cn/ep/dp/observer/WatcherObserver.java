package cn.ep.dp.observer;

import cn.ep.dp.observer.subject.BaseWaterQuality;

/**
 * 水质观察者接口定义
 *
 * @author lhl
 */
public interface WatcherObserver {

    /**
     * 被通知的方法
     *
     * @param subject 传入被观察的目标对象
     */
    void update(BaseWaterQuality subject);

    /**
     * 获取观察人员的职务
     *
     * @return 观察人员的职务
     */
    String getJob();

    /**
     * 设置观察人员的职务
     *
     * @param job 观察人员的职务
     */
    void setJob(String job);

}
