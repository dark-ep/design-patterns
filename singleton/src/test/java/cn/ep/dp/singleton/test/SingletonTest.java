package cn.ep.dp.singleton.test;

import cn.ep.dp.singleton.config.hungryman.AppConfigH;
import cn.ep.dp.singleton.config.lihc.AppConfigL;
import cn.ep.dp.singleton.config.sluggard.AppConfigS;
import cn.ep.dp.singleton.extend.OneExtend;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void testSingletonAppConfig() {
        // 创建读取应用配置的对象
        // 饿汉式
        AppConfigH configH = AppConfigH.getInstance();
        // 懒汉式
        AppConfigS configS = AppConfigS.getInstance();
        // Lazy initialization holder class
        AppConfigL configL = AppConfigL.getInstance();

        System.out.println("-----------------饿汉式单例--------------------");
        String parameterA = configH.getParameterA();
        String parameterB = configH.getParameterB();
        System.out.println("paramA=" + parameterA + ",paramB=" + parameterB);
        System.out.println("-----------------懒汉式单例--------------------");
        parameterA = configS.getParameterA();
        parameterB = configS.getParameterB();
        System.out.println("paramA=" + parameterA + ",paramB=" + parameterB);
        System.out.println("-------Lazy initialization holder class-------");
        parameterA = configL.getParameterA();
        parameterB = configL.getParameterB();
        System.out.println("paramA=" + parameterA + ",paramB=" + parameterB);
    }

    @Test
    void testSingleton() {
        OneExtend instance1 = OneExtend.getInstance();
        OneExtend instance2 = OneExtend.getInstance();
        OneExtend instance3 = OneExtend.getInstance();
        OneExtend instance4 = OneExtend.getInstance();
        OneExtend instance5 = OneExtend.getInstance();
        OneExtend instance6 = OneExtend.getInstance();
        System.out.println("t1=" + instance1);
        System.out.println("t2=" + instance2);
        System.out.println("t3=" + instance3);
        System.out.println("t4=" + instance4);
        System.out.println("t5=" + instance5);
        System.out.println("t6=" + instance6);
    }

}
