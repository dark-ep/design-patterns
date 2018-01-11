package cn.ep.dp.iterator.twoway;

/**
 * 迭代器接口，定义访问和遍历元素的操作，实现双向迭代
 *
 * @author lhl
 */
public interface Iterator {

    /**
     * 移动到聚合对象的第一个位置
     */
    void first();

    /**
     * 移动到聚合对象的下一个位置
     */
    void next();

    /**
     * 判断是否已经移动聚合对象的最后一个位置
     *
     * @return true表示已经移动聚合对象的最后一个位置，
     * false表示还没有移动到聚合对象的最后一个位置
     */
    boolean isDone();

    /**
     * 获取迭代的当前元素
     *
     * @return 迭代的当前元素
     */
    Object currentItem();

    /**
     * 判断是否为第一个元素
     *
     * @return 如果为第一个元素，返回true，否则返回false
     */
    boolean isFirst();

    /**
     * 移动到聚合对象的上一个位置
     */
    void previous();

}