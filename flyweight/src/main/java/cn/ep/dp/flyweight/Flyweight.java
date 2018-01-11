package cn.ep.dp.flyweight;

/**
 * 描述授权数据的享元接口
 *
 * @author lhl
 */
public interface Flyweight {

    /**
     * 判断传入的安全实体和权限，是否和享元对象的内部状态匹配
     *
     * @param securityEntity 安全实体
     * @param permit         权限
     * @return 是否匹配
     */
    boolean match(String securityEntity, String permit);

    /**
     * 为Flyweight添加子Flyweight
     *
     * @param flyweight 被添加的子Flyweight对象
     */
    void add(Flyweight flyweight);

}
