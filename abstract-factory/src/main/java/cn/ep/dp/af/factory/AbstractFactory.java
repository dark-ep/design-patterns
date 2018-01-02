package cn.ep.dp.af.factory;

/**
 * 抽象工厂的接口，声明创建抽象产品对象的操作
 *
 * @author lhl
 */
public interface AbstractFactory {

    /**
     * 创建元件
     *
     * @param type 元件类型
     * @return 元件
     */
    Object createModule(ModuleType type);

}
