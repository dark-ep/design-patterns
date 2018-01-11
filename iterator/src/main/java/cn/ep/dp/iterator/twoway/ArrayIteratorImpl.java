package cn.ep.dp.iterator.twoway;

/**
 * 用来实现访问数组的双向迭代接口
 *
 * @author lhl
 */
public class ArrayIteratorImpl implements Iterator {

    /**
     * 用来存放被迭代的聚合对象
     */
    private SalaryManager aggregate = null;
    /**
     * 用来记录当前迭代到的位置索引
     * -1表示刚开始的时候，迭代器指向聚合对象第一个对象之前
     */
    private int index = -1;

    ArrayIteratorImpl(SalaryManager aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggregate.size()) {
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        return index == this.aggregate.size();
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }

    @Override
    public boolean isFirst() {
        return index == 0;
    }

    @Override
    public void previous() {
        if (index > 0) {
            index = index - 1;
        }
    }

}
