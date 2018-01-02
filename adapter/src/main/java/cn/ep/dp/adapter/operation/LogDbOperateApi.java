package cn.ep.dp.adapter.operation;

import cn.ep.dp.adapter.model.LogModel;

import java.util.List;

/**
 * 定义操作日志的应用接口
 *
 * @author lhl
 */
public interface LogDbOperateApi {

    /**
     * 新增日志
     *
     * @param logModel 需要新增的日志对象
     */
    void createLog(LogModel logModel);

    /**
     * 修改日志
     *
     * @param logModel 需要修改的日志对象
     */
    void updateLog(LogModel logModel);

    /**
     * 删除日志
     *
     * @param logModel 需要删除的日志对象
     */
    void removeLog(LogModel logModel);

    /**
     * 获取所有的日志
     *
     * @return 所有的日志对象
     */
    List<LogModel> getAllLog();

}
