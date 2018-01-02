package cn.ep.dp.adapter.operation.impl;

import cn.ep.dp.adapter.model.LogModel;
import cn.ep.dp.adapter.operation.LogDbOperateApi;

import java.util.List;

/**
 * 实现对日志数据库的操作
 *
 * @author lhl
 */
public class LogDbOperate implements LogDbOperateApi {

    @Override
    public void createLog(LogModel logModel) {
        System.out.println("now in LogDbOperate createLog,lm=" + logModel);
    }

    @Override
    public void updateLog(LogModel logModel) {
        System.out.println("now in LogDbOperate updateLog,lm=" + logModel);
    }

    @Override
    public void removeLog(LogModel logModel) {
        System.out.println("now in LogDbOperate remove,lm=" + logModel);
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("now in LogDbOperate getAllLog");
        return null;
    }

}
