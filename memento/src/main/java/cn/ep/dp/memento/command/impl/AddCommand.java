package cn.ep.dp.memento.command.impl;

/**
 * @author lhl
 */
public class AddCommand extends AbstractCommand {

    private int opeNum;

    public AddCommand(int opeNum) {
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        this.operation.add(opeNum);
    }

}
