package cn.ep.dp.visitor;

import cn.ep.dp.visitor.customer.impl.*;

/**
 * 访问者接口
 *
 * @author lhl
 */
public interface Visitor {

    /**
     * 访问企业客户
     *
     * @param enterpriseCustomer 企业客户的对象
     */
    void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer);

    /**
     * 访问个人客户
     *
     * @param personalCustomer 个人客户的对象
     */
    void visitPersonalCustomer(PersonalCustomer personalCustomer);

}
