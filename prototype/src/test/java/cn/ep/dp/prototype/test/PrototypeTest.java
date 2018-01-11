package cn.ep.dp.prototype.test;

import cn.ep.dp.prototype.manage.Prototype;
import cn.ep.dp.prototype.manage.impl.PrototypeManager;
import cn.ep.dp.prototype.manage.model.*;
import cn.ep.dp.prototype.order.business.OrderBusiness;
import cn.ep.dp.prototype.order.impl.*;
import cn.ep.dp.prototype.order.manager.OrderManager;
import cn.ep.dp.prototype.order.product.impl.Product;
import org.junit.jupiter.api.Test;

class PrototypeTest {

    @Test
    void testOrder() {
        // 创建订单对象
        PersonalOrder po = new PersonalOrder();
        // 设置订单数据
        po.setOrderProductNum(2925);
        po.setCustomerName("张三");

        Product pProduct = new Product();
        pProduct.setProductId("P0001");
        pProduct.setName("产品1");
        po.setProduct(pProduct);

        // 创建订单对象
        EnterpriseOrder eo = new EnterpriseOrder();
        // 设置订单数据
        eo.setOrderProductNum(2925);
        eo.setEnterpriseName("XX公司");

        Product eProduct = new Product();
        eProduct.setProductId("P0002");
        eProduct.setName("产品2");
        eo.setProduct(eProduct);

        OrderManager.setOrder("1", eo);
        OrderManager.setOrder("2", po);

        // 获取业务处理的类
        OrderBusiness ob = new OrderBusiness();
        // 调用业务来保存订单对象
        ob.saveOrder(OrderManager.getOrder("1"));

        // 调用业务来保存订单对象
        ob.saveOrder(OrderManager.getOrder("2"));
    }

    @Test
    void testManager() {
        try {
            // 初始化原型管理器
            Prototype p1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("Prototype1", p1);

            // 获取原型来创建对象
            Prototype p3 = PrototypeManager.getPrototype("Prototype1").clone();
            p3.setName("张三");
            System.out.println("第一个实例：" + p3);

            // 有人动态的切换了实现
            Prototype p2 = new ConcretePrototype2();
            PrototypeManager.setPrototype("Prototype1", p2);

            // 重新获取原型来创建对象
            Prototype p4 = PrototypeManager.getPrototype("Prototype1").clone();
            p4.setName("李四");
            System.out.println("第二个实例：" + p4);

            // 有人注销了这个原型
            PrototypeManager.removePrototype("Prototype1");

            // 再次获取原型来创建对象
            Prototype p5 = PrototypeManager.getPrototype("Prototype1").clone();
            p5.setName("王五");
            System.out.println("第三个实例：" + p5);
        } catch (Exception err) {
            System.err.println(err.getMessage());
        }
    }

}
