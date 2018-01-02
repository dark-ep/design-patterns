package cn.ep.dp.cor.test;

import cn.ep.dp.cor.GoodsSaleEbo;
import cn.ep.dp.cor.model.SaleModel;
import org.junit.jupiter.api.Test;

class ChainOfResponsibilityTest {

    @Test
    void testSale() {
        //创建业务对象
        GoodsSaleEbo ebo = new GoodsSaleEbo();
        //准备测试数据
        SaleModel saleModel = new SaleModel();
        saleModel.setGoods("张学友怀旧经典");
        saleModel.setSaleNum(10);

        //调用业务功能
        ebo.sale("小李", "张三", saleModel);
        ebo.sale("小张", "李四", saleModel);
    }

}
