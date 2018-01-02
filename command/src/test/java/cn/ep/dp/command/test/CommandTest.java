package cn.ep.dp.command.test;

import cn.ep.dp.command.revocable.command.impl.*;
import cn.ep.dp.command.revocable.model.Calculator;
import cn.ep.dp.command.revocable.operation.*;
import org.junit.jupiter.api.Test;

class CommandTest {

    @Test
    void testRevocableCommand() {
        // 1：组装命令和接收者
        // 创建接收者
        OperationApi operation = new Operation();
        // 创建命令对象，并组装命令和接收者
        AddCommand addCmd = new AddCommand(operation, 5);
        SubstractCommand substractCmd = new SubstractCommand(operation, 3);

        // 2：把命令设置到持有者，就是计算器里面
        Calculator calculator = new Calculator();
        calculator.setAddCmd(addCmd);
        calculator.setSubstractCmd(substractCmd);

        // 3:模拟按下按钮，测试一下
        calculator.addPressed();
        System.out.println("一次加法运算后的结果为：" + operation.getResult());
        calculator.substractPressed();
        System.out.println("一次减法运算后的结果为：" + operation.getResult());

        // 测试撤消
        calculator.undoPressed();
        System.out.println("撤销一次后的结果为：" + operation.getResult());
        calculator.undoPressed();
        System.out.println("再撤销一次后的结果为：" + operation.getResult());

        // 测试恢复
        calculator.redoPressed();
        System.out.println("恢复操作一次后的结果为：" + operation.getResult());
        calculator.redoPressed();
        System.out.println("再恢复操作一次后的结果为：" + operation.getResult());
    }

    @Test
    void testMacrosCommand() {
        // 只是负责向服务员点菜就好了
        // 创建服务员
        cn.ep.dp.command.macros.model.Waiter waiter = new cn.ep.dp.command.macros.model.Waiter();

        // 创建命令对象，就是要点的菜
        cn.ep.dp.command.macros.command.Command chop = new cn.ep.dp.command.macros.command.impl.ChopCommand();
        cn.ep.dp.command.macros.command.Command duck = new cn.ep.dp.command.macros.command.impl.DuckCommand();
        cn.ep.dp.command.macros.command.Command pork = new cn.ep.dp.command.macros.command.impl.PorkCommand();

        // 点菜，就是把这些菜让服务员记录下来
        waiter.orderDish(chop);
        waiter.orderDish(duck);
        waiter.orderDish(pork);

        // 点菜完毕
        waiter.orderOver();
    }

    @Test
    void testQueueCommand() {
        // 每次重启都是重新开始
        // 先要启动后台，让整个程序运行起来
        cn.ep.dp.command.queue.operation.CookManager.runCookManager();

        // 为了简单，直接用循环模拟多个桌号点菜
        for (int i = 0; i < 5; i++) {
            // 创建服务员
            cn.ep.dp.command.queue.model.Waiter waiter = new cn.ep.dp.command.queue.model.Waiter();
            // 创建命令对象，就是要点的菜
            cn.ep.dp.command.queue.command.Command chop = new cn.ep.dp.command.queue.command.impl.ChopCommand(i);
            cn.ep.dp.command.queue.command.Command duck = new cn.ep.dp.command.queue.command.impl.DuckCommand(i);
            // 点菜，就是把这些菜让服务员记录下来
            waiter.orderDish(chop);
            waiter.orderDish(duck);
            // 点菜完毕
            waiter.orderOver();
        }
        try {
            //等待线程处理完
            Thread.sleep(10 * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testLoggerCommand() {
        // 每次重启都会先处理原有顺序
        // 先要启动后台，让整个程序运行起来
        cn.ep.dp.command.logger.operation.CookManager.runCookManager();

        // 为了简单，直接用循环模拟多个桌号点菜
        for (int i = 0; i < 5; i++) {
            // 创建服务员
            cn.ep.dp.command.logger.model.Waiter waiter = new cn.ep.dp.command.logger.model.Waiter();
            // 创建命令对象，就是要点的菜
            cn.ep.dp.command.logger.command.Command chop = new cn.ep.dp.command.logger.command.impl.ChopCommand(i);
            cn.ep.dp.command.logger.command.Command duck = new cn.ep.dp.command.logger.command.impl.DuckCommand(i);
            // 点菜，就是把这些菜让服务员记录下来
            waiter.orderDish(chop);
            waiter.orderDish(duck);
            // 点菜完毕
            waiter.orderOver();
        }
        try {
            //等待线程处理完
            Thread.sleep(10 * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
