package cn.ep.dp.prototype.manage;

/**
 * @author lhl
 */
public interface Prototype {

    /**
     * 克隆对象
     *
     * @return 克隆的新对象
     */
    Prototype clone();

    /**
     * 获取名称
     *
     * @return 名称
     */
    String getName();

    /**
     * 设置名称
     *
     * @param name 名称
     */
    void setName(String name);

}