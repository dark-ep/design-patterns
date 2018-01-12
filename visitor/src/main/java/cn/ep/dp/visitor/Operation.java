package cn.ep.dp.visitor;

import cn.ep.dp.visitor.customer.BaseCustomer;

import java.util.*;

/**
 * 操作类
 *
 * @author lhl
 */
public class Operation {

    /**
     * 要操作的客户集合
     */
    private Collection<BaseCustomer> customers = new ArrayList<>();

    /**
     * 提供给客户端操作的高层接口，具体的功能由客户端传入的访问者决定
     *
     * @param visitor 客户端需要使用的访问者
     */
    public void handleRequest(Visitor visitor) {
        for (BaseCustomer customer : customers) {
            customer.accept(visitor);
        }
    }

    /**
     * 组建客户集合，向客户集合中添加客户
     *
     * @param customer 加入到客户集合的客户对象
     */
    public void addCustomer(BaseCustomer customer) {
        customers.add(customer);
    }

}
