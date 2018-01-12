package cn.ep.dp.visitor.customer.impl;

import cn.ep.dp.visitor.Visitor;
import cn.ep.dp.visitor.customer.BaseCustomer;

/**
 * 个人客户
 *
 * @author lhl
 */
public class PersonalCustomer extends BaseCustomer {

    /**
     * 电话
     */
    private String telephone;

    /**
     * 年龄
     */
    private int age;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPersonalCustomer(this);
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
