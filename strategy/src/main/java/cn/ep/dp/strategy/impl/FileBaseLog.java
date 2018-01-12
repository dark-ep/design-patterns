package cn.ep.dp.strategy.impl;

/**
 * 把日志记录到数据库
 *
 * @author lhl
 */
public class FileBaseLog extends BaseLogStrategy {

    @Override
    public void doLog(String msg) {
        System.out.println("现在把 '" + msg + "' 记录到文件中");
    }

}
