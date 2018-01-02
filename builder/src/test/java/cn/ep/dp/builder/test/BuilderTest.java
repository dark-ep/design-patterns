package cn.ep.dp.builder.test;

import cn.ep.dp.builder.common.builder.impl.*;
import cn.ep.dp.builder.common.director.Director;
import cn.ep.dp.builder.common.exportmodel.*;
import cn.ep.dp.builder.complex.model.InsuranceContract;
import org.junit.jupiter.api.Test;

import java.util.*;

class BuilderTest {

    @Test
    void testCommonBuilder() {
        // 准备测试数据
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("一分公司");
        ehm.setExportDate("2011-02-22");

        Map<String, Collection<ExportDataModel>> mapData = new HashMap<>();
        Collection<ExportDataModel> col = new ArrayList<>();

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("产品001号");
        edm1.setPrice(100);
        edm1.setAmount(80);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("产品002号");
        edm2.setPrice(99);
        edm2.setAmount(55);

        // 组装数据
        col.add(edm1);
        col.add(edm2);
        mapData.put("销售记录表", col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("张三");

        // 测试输出到文本文件
        TxtBuilder txtBuilder = new TxtBuilder();
        // 创建指导者对象
        Director director = new Director(txtBuilder);
        director.construct(ehm, mapData, efm);
        // 把要输出的内容输出到控制台
        System.out.println("\n输出到文本文件的内容：\n" + txtBuilder.getResult());

        // 测试输出到XML
        XmlBuilder xmlBuilder = new XmlBuilder();
        // 创建指导者对象
        Director director2 = new Director(xmlBuilder);
        director2.construct(ehm, mapData, efm);
        // 把要输出的内容输出到控制台
        System.out.println("\n输出到XML的内容：\n" + xmlBuilder.getResult());
    }

    @Test
    void testComplexBuilder() {
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("001", 12345L, 67890L);
        InsuranceContract contract = builder.setPersonName("张三").setOtherDate("test").build();
        contract.someOperation();
    }

}
