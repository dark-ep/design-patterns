package cn.ep.dp.adapter.test;

import cn.ep.dp.adapter.adapter.twoway.LogOperationAdapter;
import cn.ep.dp.adapter.model.LogModel;
import cn.ep.dp.adapter.operation.*;
import cn.ep.dp.adapter.operation.impl.*;
import org.junit.jupiter.api.Test;

import java.util.*;

class TwoWayAdapterTest {

    @Test
    void testTwoway() {
        // 准备日志内容，也就是测试的数据
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("admin");
        logModel.setOperateTime("2011-02-14 16:34:30");
        logModel.setLogContent("这是一个测试");
        List<LogModel> list = new ArrayList<>();
        list.add(logModel);

        // 创建操作日志文件的对象
        LogFileOperateApi fileOperateApi = new LogFileOperate("");
        LogDbOperateApi dbOperateApi = new LogDbOperate();

        // 创建经过双向适配后的操作日志的接口对象
        LogFileOperateApi fileOperateAdapter = new LogOperationAdapter(fileOperateApi, dbOperateApi);
        LogDbOperateApi dbOperateAdapter = new LogOperationAdapter(fileOperateApi, dbOperateApi);

        dbOperateAdapter.createLog(logModel);
        List<LogModel> allLog = dbOperateAdapter.getAllLog();
        System.out.println("allLog=" + allLog);

        fileOperateAdapter.writeLogFile(list);
        fileOperateAdapter.readLogFile();
    }
}
