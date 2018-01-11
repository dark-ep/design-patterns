package cn.ep.dp.fm.test;

import cn.ep.dp.fm.creator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FactoryMethodTest {

    @Test
    void testExportOperation() {
        // 创建需要使用的Creator对象
        ExportOperate operate = new ExportOperate();
        // 调用输出数据的功能方法
        assertTrue(operate.export(1, "测试数据"));// 文本文件方式
        assertTrue(operate.export(2, "测试数据"));// 数据库备份文件方式
    }

    @Test
    void testExportOperation2() {
        // 创建需要使用的Creator对象
        ExportOperate2 operate = new ExportOperate2();
        // 调用输出数据的功能方法
        assertTrue(operate.export(1, "测试数据"));// 文本文件方式
        assertTrue(operate.export(2, "测试数据"));// 数据库备份文件方式
        assertTrue(operate.export(3, "测试数据"));// XML文件方式
    }

}
