package cn.ep.dp.prototype.order.impl;

import cn.ep.dp.prototype.order.OrderApi;
import cn.ep.dp.prototype.order.product.impl.Product;

/**
 * 企业订单
 *
 * @author lhl
 */
public class EnterpriseOrder implements OrderApi {

    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 产品编号
     */
    private Product product;

    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public OrderApi cloneOrder() {
        // 创建一个新的订单，然后把本实例的数据复制过去
        EnterpriseOrder order = new EnterpriseOrder();
        order.setEnterpriseName(this.enterpriseName);
        order.setOrderProductNum(this.orderProductNum);
        //对于对象类型的数据,深度克隆的时候需要继续调用这个对象的克隆方法
        order.setProduct((Product) this.product.cloneProduct());
        return order;
    }

    @Override
    public String toString() {
        return "本企业订单的订购企业是=" + this.getEnterpriseName() + ",订购产品是=" + this.getProduct().getName() + ",订购数量为="
                + this.getOrderProductNum();
    }

}
