package cn.ep.dp.command.macros.command.impl;

import cn.ep.dp.command.macros.command.Command;
import cn.ep.dp.command.macros.operation.CookApi;

/**
 * 命令对象，绿豆排骨煲
 *
 * @author lhl
 */
public class ChopCommand implements Command {

    /**
     * 持有具体做菜的厨师的对象
     */
    private CookApi cookApi = null;

    /**
     * 设置具体做菜的厨师的对象
     *
     * @param cookApi 具体做菜的厨师的对象
     */
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        this.cookApi.cook("绿豆排骨煲");
    }

}
