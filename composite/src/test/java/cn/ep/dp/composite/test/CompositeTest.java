package cn.ep.dp.composite.test;

import cn.ep.dp.composite.*;
import org.junit.jupiter.api.Test;

class CompositeTest {

    @Test
    void test() {
        //定义所有的组合对象
        BaseComponent root = new Composite("服装");
        BaseComponent c1 = new Composite("男装");
        BaseComponent c2 = new Composite("女装");
        //定义所有的叶子对象
        BaseComponent leaf1 = new Leaf("衬衣");
        BaseComponent leaf2 = new Leaf("夹克");
        BaseComponent leaf3 = new Leaf("裙子");
        BaseComponent leaf4 = new Leaf("套装");
        //按照树的结构来组合组合对象和叶子对象
        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);

        //调用根对象的输出功能来输出整棵树
        root.printStruct("");

        System.out.println("---------------------------->");

        //然后删除一个节点
        root.removeChild(c1);
        //重新输出整棵树
        root.printStruct("");
    }

}
