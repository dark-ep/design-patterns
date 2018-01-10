package cn.ep.dp.facade.dao;

import cn.ep.dp.facade.config.*;

/**
 * 示意生成数据层的模块
 *
 * @author lhl
 */
public class Dao {

    public void generate() {
        // 1：从配置管理里面获取响应的配置信息
        ConfigModel configData = ConfigManager.getInstance().getConfigData();
        if (configData.isNeedGenDAO()) {
            // 2：按照要求去生成那个相应的代码，并保存成文件
            System.out.println("正在生成数据层代码文件");
        }
    }

}
