package cn.ep.dp.singleton.config.sluggard;

import java.io.*;
import java.util.Properties;

/**
 * 懒汉式单例实现读取配置文件
 *
 * @author lhl
 */
public class AppConfigS {

    /**
     * 定义一个变量来存储创建好的类实例，直接在这里创建类实例，只能创建一次
     */
    private static AppConfigS instance = null;
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
    private AppConfigS() {
        readConfig();
    }


    /*
    //双重检查加锁 只能用于Java5以上
    private volatile static AppConfigS instance = null;

    public static AppConfigS getInstance() { // 先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null) { // 同步块，线程安全地创建实例
            synchronized (AppConfigS.class) {
                // 再次判断实力是否存在，如果不存在才真正地创建实例
                if (instance == null) {
                    instance = new
                            AppConfigS();
                }
            }
        }
        return instance;
    }
    */

    /**
     * 定义一个方法来为客户端提供AppConfig类的实例
     *
     * @return 一个AppConfig的实例
     */
    public static synchronized AppConfigS getInstance() {
        // 判断存储实例的变量是否有值
        if (instance == null) {
            // 如果没有，就创建一个类实例，并把值赋值给存储类实例的变量
            instance = new AppConfigS();
        }
        return instance;
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

}
