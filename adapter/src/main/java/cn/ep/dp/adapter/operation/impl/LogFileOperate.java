package cn.ep.dp.adapter.operation.impl;

import cn.ep.dp.adapter.model.LogModel;
import cn.ep.dp.adapter.operation.LogFileOperateApi;

import java.io.*;
import java.util.*;

/**
 * 实现对日志文件的操作
 *
 * @author lhl
 */
public class LogFileOperate implements LogFileOperateApi {

    /**
     * 日志文件的路径和文件名称，默认是当前项目根下AdapterLog.log
     */
    private String logFilePathName = "AdapterLog.log";

    private File root = new File(ClassLoader.getSystemResource(".").getPath());

    /**
     * 构造方法，传入文件的路径和名称
     *
     * @param logFilePathName 文件的路径和名称
     */
    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<LogModel> readLogFile() {
        ObjectInputStream oin = null;
        List<LogModel> list = null;
        try {
            File file = new File(root, logFilePathName);
            if (file.exists()) {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>) oin.readObject();
            } else {
                list = new ArrayList<>();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oin != null) {
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        ObjectOutputStream oout = null;
        try {
            File file = new File(root, logFilePathName);
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oout != null) {
                    oout.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
