package cn.ep.dp.prototype.order.business;

import cn.ep.dp.prototype.order.OrderApi;

/**
 * 处理订单的业务对象
 *
 * @author lhl
 */
public class OrderBusiness {

    private static final int DEFAULT_NUM = 1000;

    /**
     * 创建订单的方法
     *
     * @param order 订单的接口对象
     */
    public void saveOrder(OrderApi order) {
        // 1：判断当前的预定产品数量是否大于1000
        while (order.getOrderProductNum() > DEFAULT_NUM) {
            // 2：如果大于，还需要继续拆分
            // 2.1 再新建一份订单，跟传入的订单除了数量不一样外，其他都相同
            OrderApi newOrder = order.cloneOrder();
            // 然后进行赋值，产品数量为1000
            newOrder.setOrderProductNum(1000);
            // 2.2 原来的订单保留，把数量设置成减少1000
            order.setOrderProductNum(order.getOrderProductNum() - 1000);
            // 然后是业务功能处理，打印输出
            System.out.println("拆分生成订单==" + newOrder);
        }
        // 3：不超过，那就直接业务功能处理，打印输出
        System.out.println("订单==" + order);
    }

}
