package cn.ep.dp.adapter.operation;

import cn.ep.dp.adapter.model.LogModel;

import java.util.List;

/**
 * 日志文件操作接口
 *
 * @author lhl
 */
public interface LogFileOperateApi {

    /**
     * 读取日志文件，从文件里面获取存储的日志列表对象
     *
     * @return 存储的日志列表对象
     */
    List<LogModel> readLogFile();

    /**
     * 写日志文件，把日志列表写出到日志文件中去
     *
     * @param list 日志内容对象
     */
    void writeLogFile(List<LogModel> list);

}
