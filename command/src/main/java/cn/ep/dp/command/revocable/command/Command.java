package cn.ep.dp.command.revocable.command;

/**
 * 命令接口，声明执行的操作，支持可撤销操作
 *
 * @author lhl
 */
public interface Command {

    /**
     * 执行命令对应的操作
     */
    void execute();

    /**
     * 执行撤销命令对应的操作
     */
    void undo();

}
