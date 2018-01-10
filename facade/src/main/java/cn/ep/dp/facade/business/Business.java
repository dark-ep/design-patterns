package cn.ep.dp.facade.business;

import cn.ep.dp.facade.config.*;

/**
 * 示意生成逻辑层的模块
 *
 * @author lhl
 */
public class Business {

    public void generate() {
        // 1：从配置管理里面获取响应的配置信息
        ConfigModel configData = ConfigManager.getInstance().getConfigData();
        if (configData.isNeedGenBusiness()) {
            // 2：按照要求去生成那个相应的代码，并保存成文件
            System.out.println("正在生成逻辑层代码文件");
        }
    }

}
