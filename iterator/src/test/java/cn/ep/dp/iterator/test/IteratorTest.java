package cn.ep.dp.iterator.test;

import org.junit.jupiter.api.Test;

import java.util.Collection;

class IteratorTest {

    private static void print(Collection col) {
        for (Object obj : col) {
            System.out.println(obj);
        }
    }

    @Test
    void testOneway() {
        //访问新收购公司的工资列表
        cn.ep.dp.iterator.oneway.SalaryManager salaryManager = new cn.ep.dp.iterator.oneway.SalaryManager();
        //先计算再获取
        salaryManager.calcSalary();
        //得到翻页迭代器
        cn.ep.dp.iterator.oneway.AggregationIterator it = salaryManager.createIterator();

        //获取第一页，每页显示2条
        Collection col = it.getPage(1, 2);
        System.out.println("第一页数据：");
        print(col);
        //获取第二页，每页显示2条
        Collection col2 = it.getPage(2, 2);
        System.out.println("第二页数据：");
        print(col2);
        //再次获取第一页
        Collection col3 = it.getPage(1, 2);
        System.out.println("再次获取第一页数据：");
        print(col3);
        //获取第三页
        Collection col4 = it.getPage(3, 2);
        System.out.println("获取第三页数据：");
        print(col4);
    }

    @Test
    void testTwoway() {
        //访问新收购公司的工资列表
        cn.ep.dp.iterator.twoway.SalaryManager salaryManager = new cn.ep.dp.iterator.twoway.SalaryManager();
        //先计算再获取
        salaryManager.calcSalary();

        //得到双向迭代器
        cn.ep.dp.iterator.twoway.Iterator it = salaryManager.createIterator();
        //首先设置迭代器到第一个元素
        it.first();

        //先next一个
        if (!it.isDone()) {
            cn.ep.dp.iterator.twoway.PayModel pm = (cn.ep.dp.iterator.twoway.PayModel) it.currentItem();
            System.out.println("next1 == " + pm);
            //向下迭代一个
            it.next();
        }
        //然后previous一个
        if (!it.isFirst()) {
            //向前迭代一个
            it.previous();
            cn.ep.dp.iterator.twoway.PayModel pm = (cn.ep.dp.iterator.twoway.PayModel) it.currentItem();
            System.out.println("previous1 == " + pm);
        }
        //再next一个
        if (!it.isDone()) {
            cn.ep.dp.iterator.twoway.PayModel pm = (cn.ep.dp.iterator.twoway.PayModel) it.currentItem();
            System.out.println("next2 == " + pm);
            //向下迭代一个
            it.next();
        }
        //继续next一个
        if (!it.isDone()) {
            cn.ep.dp.iterator.twoway.PayModel pm = (cn.ep.dp.iterator.twoway.PayModel) it.currentItem();
            System.out.println("next3 == " + pm);
            //向下迭代一个
            it.next();
        }
        //然后previous一个
        if (!it.isFirst()) {
            //向前迭代一个
            it.previous();
            cn.ep.dp.iterator.twoway.PayModel pm = (cn.ep.dp.iterator.twoway.PayModel) it.currentItem();
            System.out.println("previous2 == " + pm);
        }
    }

}
