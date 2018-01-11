package cn.ep.dp.prototype.order.manager;

import cn.ep.dp.prototype.order.OrderApi;

import java.util.*;

/**
 * 订单管理
 *
 * @author lhl
 */
public class OrderManager {

    /**
     * 用来记录订单的编号和订单实例的对应关系
     */
    private static Map<String, OrderApi> orders = new HashMap<>();

    /**
     * 私有化构造方法，避免外部无谓的创建实例
     */
    private OrderManager() {

    }

    /**
     * 向订单管理器里面添加或是修改某个订单注册
     *
     * @param orderId 订单编号
     * @param order   订单实例
     */
    public synchronized static void setOrder(String orderId, OrderApi order) {
        orders.put(orderId, order);
    }

    /**
     * 从订单管理器中面删除某个订单注册
     *
     * @param orderId 订单编号
     */
    public synchronized static void removeOrder(String orderId) {
        orders.remove(orderId);
    }

    /**
     * 获取某个订单编号对应的订单实例
     *
     * @param orderId 订单编号
     * @return 订单编号对应的订单实例
     */
    public synchronized static OrderApi getOrder(String orderId) {
        OrderApi order = orders.get(orderId);
        if (order == null) {
            throw new NullPointerException("您希望获取的订单还没有注册或已被销毁");
        }
        return order;
    }

}
