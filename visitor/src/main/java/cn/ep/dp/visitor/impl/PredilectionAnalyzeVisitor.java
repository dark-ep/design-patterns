package cn.ep.dp.visitor.impl;

import cn.ep.dp.visitor.Visitor;
import cn.ep.dp.visitor.customer.impl.*;

/**
 * 实现对客户的偏好分析
 *
 * @author lhl
 */
public class PredilectionAnalyzeVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) {
        System.out.println("现在对企业客户" + enterpriseCustomer.getName() + "进行产品偏好分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer personalCustomer) {
        System.out.println("现在对个人客户" + personalCustomer.getName() + "进行产品偏好分析");
    }

}
