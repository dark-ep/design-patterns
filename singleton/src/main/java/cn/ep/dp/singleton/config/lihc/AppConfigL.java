package cn.ep.dp.singleton.config.lihc;

import java.io.*;
import java.util.Properties;

/**
 * Lazy initialization holder class模式单例实现读取配置文件
 *
 * @author lhl
 */
public class AppConfigL {

    /**
     * 用于存放配置文件中参数A的值
     */
    private String parameterA;

    /**
     * 用于存放配置文件中参数B的值
     */
    private String parameterB;

    /**
     * 构造方法
     */
    private AppConfigL() {
        readConfig();
    }

    /**
     * 定义一个方法来为客户端提供AppConfig类的实例
     *
     * @return 一个AppConfig的实例
     */
    public static AppConfigL getInstance() {
        return AppConfigHolder.instance;
    }

    /**
     * 读取配置文件，把配置文件中的内容读出来设置到属性上
     */
    private void readConfig() {
        Properties p = new Properties();
        InputStream in = null;
        try {
            // 项目根目录下AppConfig.properties
            in = ClassLoader.getSystemResourceAsStream("AppConfig.properties");
            p.load(in);
            // 把配置文件中的内容读出来设置到属性上
            parameterA = p.getProperty("paramA");
            parameterB = p.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("装载配置文件出错了，具体堆栈信息如下：");
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getParameterA() {
        return parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系， 而且只有被调用到时才会装载，从而实现了延迟加载
     */
    private static class AppConfigHolder {
        /**
         * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，由JVM来保证线程安全
         */
        private static AppConfigL instance = new AppConfigL();
    }

}
