package cn.ep.dp.command.macros.operation.impl;

import cn.ep.dp.command.macros.operation.CookApi;

/**
 * 厨师对象，做热菜
 *
 * @author lhl
 */
public class HotCook implements CookApi {

    @Override
    public void cook(String name) {
        System.out.println("本厨师正在做：" + name);
    }

}