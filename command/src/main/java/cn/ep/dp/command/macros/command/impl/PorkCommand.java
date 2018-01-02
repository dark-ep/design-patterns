package cn.ep.dp.command.macros.command.impl;

import cn.ep.dp.command.macros.command.Command;
import cn.ep.dp.command.macros.operation.CookApi;

/**
 * 命令对象，蒜泥白肉
 *
 * @author lhl
 */
public class PorkCommand implements Command {

    private CookApi cookApi = null;

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        this.cookApi.cook("蒜泥白肉");
    }

}