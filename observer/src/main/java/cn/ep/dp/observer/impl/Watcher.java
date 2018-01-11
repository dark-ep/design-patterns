package cn.ep.dp.observer.impl;

import cn.ep.dp.observer.WatcherObserver;
import cn.ep.dp.observer.subject.BaseWaterQuality;

/**
 * @author lhl
 */
public class Watcher implements WatcherObserver {

    /**
     * 职务
     */
    private String job;

    @Override
    public String getJob() {
        return job;
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void update(BaseWaterQuality subject) {
        // 这里是采用拉的方式
        System.out.println(job + "获取到通知，当前污染级别为：" + subject.getPolluteLevel());
    }

}
