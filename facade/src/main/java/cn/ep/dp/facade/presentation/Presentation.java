package cn.ep.dp.facade.presentation;

import cn.ep.dp.facade.config.*;

/**
 * 示意生成表现层的模块
 *
 * @author lhl
 */
public class Presentation {

    public void generate() {
        // 1：从配置管理里面获取响应的配置信息
        ConfigModel configData = ConfigManager.getInstance().getConfigData();
        if (configData.isNeedGenPresentation()) {
            // 2：按照要求去生成那个相应的代码，并保存成文件
            System.out.println("正在生成表现层代码文件");
        }
    }

}
