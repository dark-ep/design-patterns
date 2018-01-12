package cn.ep.dp.strategy.impl;

import cn.ep.dp.strategy.LogStrategy;

/**
 * 实现日志策略的抽象模板，实现给消息添加时间
 *
 * @author lhl
 */
public abstract class BaseLogStrategy implements LogStrategy {

    @Override
    public final void log(String msg) {
        doLog(msg);
    }

    /**
     * 真正执行日志记录，让子类去具体实现
     *
     * @param msg 需记录的日志信息
     */
    protected abstract void doLog(String msg);

}