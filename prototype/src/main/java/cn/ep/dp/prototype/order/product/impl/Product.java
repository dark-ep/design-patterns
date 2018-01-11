package cn.ep.dp.prototype.order.product.impl;

import cn.ep.dp.prototype.order.product.ProductPrototype;

/**
 * 产品对象
 *
 * @author lhl
 */
public class Product implements ProductPrototype {

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 产品名称
     */
    private String name;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "产品编号=" + this.productId + ",产品名称=" + this.name;
    }

    @Override
    public ProductPrototype cloneProduct() {
        //创建一个新的订单,然后把本实例的数据复制过去
        Product product = new Product();
        product.setProductId(this.productId);
        product.setName(this.name);
        return product;
    }

}
