package cn.ep.dp.command.queue.operation;

import java.util.concurrent.*;

/**
 * 后厨的管理类，通过此类让后厨的厨师进行运行状态
 *
 * @author lhl
 */
public class CookManager {

    private static ExecutorService executorService;

    /**
     * 用来控制是否需要创建厨师，如果已经创建过了就不要再执行了
     */
    private static boolean runFlag = false;

    static {
        executorService = Executors.newCachedThreadPool();
    }

    public static void runCookManager() {
        if (!runFlag) {
            runFlag = true;
            HotCook.runFlag = true;
            // 创建三位厨师
            HotCook cook1 = new HotCook("张三");
            HotCook cook2 = new HotCook("李四");
            HotCook cook3 = new HotCook("王五");
            // 启动他们的线程
            executorService.execute(cook1);
            executorService.execute(cook2);
            executorService.execute(cook3);
        } else {
            HotCook.runFlag = false;
        }
    }

}
