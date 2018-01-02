package cn.ep.dp.adapter.adapter.oneway;

import cn.ep.dp.adapter.model.LogModel;
import cn.ep.dp.adapter.operation.*;

import java.util.List;

/**
 * 适配器对象
 *
 * @author lhl
 */
public class LogOperationAdapter implements LogDbOperateApi {

    /**
     * 持有需要被适配的文件存储日志的接口对象
     */
    private LogFileOperateApi fileLog;

    public LogOperationAdapter(LogFileOperateApi fileLog) {
        this.fileLog = fileLog;
    }

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
    public List<LogModel> getAllLog() {
        return fileLog.readLogFile();
    }

}
