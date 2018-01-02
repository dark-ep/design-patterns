package cn.ep.dp.adapter.adapter.twoway;

import cn.ep.dp.adapter.model.LogModel;
import cn.ep.dp.adapter.operation.*;

import java.util.List;

/**
 * 双向适配器对象
 *
 * @author lhl
 */
public class LogOperationAdapter implements LogDbOperateApi, LogFileOperateApi {

    /**
     * 持有需要被适配的文件存储日志的接口对象
     */
    private LogFileOperateApi fileLog;

    /**
     * 持有需要被适配的DB存储日志的接口对象
     */
    private LogDbOperateApi dbLog;

    public LogOperationAdapter(LogFileOperateApi fileLog, LogDbOperateApi dbLog) {
        this.fileLog = fileLog;
        this.dbLog = dbLog;
    }

    /**
     * 以下是把文件操作的方式适配成为DB实现方式的接口
     */
    @Override
    public void createLog(LogModel logModel) {
        // 1：先读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        // 2：加入新的日志对象
        list.add(logModel);
        // 3：重新写入文件
        fileLog.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return fileLog.readLogFile();
    }

    @Override
    public void removeLog(LogModel logModel) {
        // 1：先读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        // 2：删除相应的日志对象
        list.remove(logModel);
        // 3：重新写入文件
        fileLog.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        // 1：先读取文件的内容
        List<LogModel> list = fileLog.readLogFile();
        // 2：修改相应的日志对象
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(logModel.getLogId())) {
                list.set(i, logModel);
                break;
            }
        }
        // 3：重新写入文件
        fileLog.writeLogFile(list);
    }

    /**
     * 以下是把文件DB操作的方式适配成为文件实现方式的接口
     */
    @Override
    public List<LogModel> readLogFile() {
        return dbLog.getAllLog();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        // 1：最简单的实现思路是先删除数据库中的数据
        // 2：然后循环把现在的数据加入到数据库中
        for (LogModel logModel : list) {
            dbLog.createLog(logModel);
        }
    }

}
