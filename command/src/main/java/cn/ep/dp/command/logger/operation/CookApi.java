package cn.ep.dp.command.logger.operation;

/**
 * 厨师的接口
 *
 * @author lhl
 */
public interface CookApi {

    /**
     * 示意，做菜的方法
     *
     * @param tableNum 点菜的桌号
     * @param name     菜名
     */
    void cook(int tableNum, String name);

}
