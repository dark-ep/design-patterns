package cn.ep.dp.visitor.test;

import cn.ep.dp.visitor.Operation;
import cn.ep.dp.visitor.customer.BaseCustomer;
import cn.ep.dp.visitor.customer.impl.*;
import cn.ep.dp.visitor.impl.*;
import org.junit.jupiter.api.Test;

class VisitorTest {

    @Test
    void testAnalyze() {
        BaseCustomer c1 = new EnterpriseCustomer();
        c1.setName("ABC公司");
        BaseCustomer c2 = new EnterpriseCustomer();
        c2.setName("CDE集团");
        BaseCustomer c3 = new PersonalCustomer();
        c3.setName("张三");

        Operation operation = new Operation();
        operation.addCustomer(c1);
        operation.addCustomer(c2);
        operation.addCustomer(c3);

        ServiceRequestVisitor serviceRequestVisitor = new ServiceRequestVisitor();
        operation.handleRequest(serviceRequestVisitor);

        PredilectionAnalyzeVisitor predilectionAnalyzeVisitor = new PredilectionAnalyzeVisitor();
        operation.handleRequest(predilectionAnalyzeVisitor);

        WorthAnalyzeVisitor worthAnalyzeVisitor = new WorthAnalyzeVisitor();
        operation.handleRequest(worthAnalyzeVisitor);
    }

}
