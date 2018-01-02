package cn.ep.dp.command.logger.command.impl;

import cn.ep.dp.command.logger.command.Command;
import cn.ep.dp.command.logger.operation.CookApi;

import java.io.Serializable;

/**
 * 命令对象，北京烤鸭
 *
 * @author lhl
 */
public class DuckCommand implements Command, Serializable {

    private CookApi cookApi = null;
    private int tableNum;

    public DuckCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public int getTableNum() {
        return this.tableNum;
    }

    @Override
    public void execute() {
        this.cookApi.cook(tableNum, "北京烤鸭");
    }

}
