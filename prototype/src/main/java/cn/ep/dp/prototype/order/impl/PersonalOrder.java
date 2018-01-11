package cn.ep.dp.prototype.order.impl;

import cn.ep.dp.prototype.order.OrderApi;
import cn.ep.dp.prototype.order.product.impl.Product;

/**
 * 个人订单对象
 *
 * @author lhl
 */
public class PersonalOrder implements OrderApi {

    /**
     * 订购人员姓名
     */
    private String customerName;

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(this.customerName);
        order.setOrderProductNum(this.orderProductNum);
        order.setProduct((Product) this.product.cloneProduct());
        return order;
    }

    @Override
    public String toString() {
        return "本个人订单的订购人是=" + this.getCustomerName() + ",订购产品是=" + this.getProduct().getName() + ",订购数量为="
                + this.getOrderProductNum();
    }
}
