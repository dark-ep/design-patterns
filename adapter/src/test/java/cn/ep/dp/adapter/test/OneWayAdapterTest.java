package cn.ep.dp.adapter.test;

import cn.ep.dp.adapter.adapter.oneway.LogOperationAdapter;
import cn.ep.dp.adapter.model.LogModel;
import cn.ep.dp.adapter.operation.*;
import cn.ep.dp.adapter.operation.impl.LogFileOperate;
import org.junit.jupiter.api.Test;

import java.util.*;

class OneWayAdapterTest {

    @Test
    void testOneway() {
        // 准备日志内容，也就是测试的数据
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("admin");
        logModel.setOperateTime("2011-02-14 16:34:30");
        logModel.setLogContent("这是一个测试");
        List<LogModel> list = new ArrayList<>();
        list.add(logModel);

        // 创建操作日志文件的对象
        LogFileOperateApi logFileApi = new LogFileOperate("");

        // 创建新版的操作日志的接口对象
        LogDbOperateApi api = new LogOperationAdapter(logFileApi);

        // 保存日志文件
        api.createLog(logModel);

        // 读取日志文件的内容
        List<LogModel> allLog = api.getAllLog();
        System.out.println("allLog=" + allLog);
    }

}
