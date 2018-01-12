package cn.ep.dp.visitor.impl;

import cn.ep.dp.visitor.Visitor;
import cn.ep.dp.visitor.customer.impl.*;

/**
 * 实现客户提出服务请求的功能
 *
 * @author lhl
 */
public class ServiceRequestVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) {
        // 企业客户提出的具体服务请求
        System.out.println(enterpriseCustomer.getName() + "企业提出服务请求");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer personalCustomer) {
        // 个人客户提出的具体服务请求
        System.out.println(personalCustomer.getName() + "提出服务请求");
    }

}
