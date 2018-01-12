package cn.ep.dp.strategy.impl;

/**
 * 把日志记录到数据库
 *
 * @author lhl
 */
public class DbBaseLog extends BaseLogStrategy {

    public static final int MSG_LENGTH = 5;

    @Override
    public void doLog(String msg) {
        //制造错误
        if (msg != null && msg.trim().length() > MSG_LENGTH) {
            int a = 5 / 0;
        }
        System.out.println("现在把 '" + msg + "' 记录到数据库中");
    }

}
