package cn.ep.dp.command.macros.operation.impl;

import cn.ep.dp.command.macros.operation.CookApi;

/**
 * 厨师对象，做凉菜
 *
 * @author lhl
 */
public class CoolCook implements CookApi {

    @Override
    public void cook(String name) {
        System.out.println("凉菜" + name + "已经做好，本厨师正在装盘。");
    }

}