package cn.ep.dp.prototype.order.product;

/**
 * 声明一个克隆产品自身的接口
 *
 * @author lhl
 */
public interface ProductPrototype {

    /**
     * 克隆产品自身的方法
     *
     * @return 一个从自身克隆出来的产品对象
     */
    ProductPrototype cloneProduct();

}
