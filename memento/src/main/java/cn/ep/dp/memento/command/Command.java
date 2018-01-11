package cn.ep.dp.memento.command;

import cn.ep.dp.memento.Memento;

/**
 * 定义一个命令的接口
 *
 * @author lhl
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令，恢复到备忘录对象记录的状态
     *
     * @param m 备忘录对象
     */
    void undo(Memento m);

    /**
     * 重做命令，恢复到备忘录对象记录的状态
     *
     * @param m 备忘录对象
     */
    void redo(Memento m);

    /**
     * 创建保存原发器对象的状态的备忘录对象
     *
     * @return 创建好的备忘录对象
     */
    Memento createMemento();

}
