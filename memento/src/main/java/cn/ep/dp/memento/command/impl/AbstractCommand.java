package cn.ep.dp.memento.command.impl;

import cn.ep.dp.memento.Memento;
import cn.ep.dp.memento.command.Command;
import cn.ep.dp.memento.operation.OperationApi;

/**
 * 命令对象的公共对象，实现各个命令对象的公共方法
 *
 * @author lhl
 */
public abstract class AbstractCommand implements Command {

    /**
     * 持有真正的命令实现者对象
     */
    OperationApi operation = null;

    /**
     * 具体的功能实现，这里不管
     */
    @Override
    public abstract void execute();

    public void setOperation(OperationApi operation) {
        this.operation = operation;
    }

    @Override
    public Memento createMemento() {
        return this.operation.createMemento();
    }

    @Override
    public void redo(Memento m) {
        this.operation.setMemento(m);
    }

    @Override
    public void undo(Memento m) {
        this.operation.setMemento(m);
    }

}
