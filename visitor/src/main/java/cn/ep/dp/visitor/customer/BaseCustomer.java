package cn.ep.dp.visitor.customer;

import cn.ep.dp.visitor.Visitor;

/**
 * 客户
 *
 * @author lhl
 */
public abstract class BaseCustomer {

    /**
     * 客户ID
     */
    private String customerId;

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 接受访问者的访问
     *
     * @param visitor 访问者对象
     */
    public abstract void accept(Visitor visitor);

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
