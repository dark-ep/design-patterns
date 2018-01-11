package cn.ep.dp.memento.operation;

import cn.ep.dp.memento.Memento;

/**
 * 运算类，真正实现加减法运算
 *
 * @author lhl
 */
public class Operation implements OperationApi {

    /**
     * 记录运算的结果
     */
    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void add(int num) {
        result += num;
    }

    @Override
    public void substract(int num) {
        result -= num;
    }

    @Override
    public Memento createMemento() {
        return new MementoImpl(result);
    }

    @Override
    public void setMemento(Memento memento) {
        MementoImpl m = (MementoImpl) memento;
        this.result = m.getResult();
    }

    /**
     * 备忘录对象
     */
    private static class MementoImpl implements Memento {
        private int result = 0;

        private MementoImpl(int result) {
            this.result = result;
        }

        private int getResult() {
            return result;
        }
    }

}
