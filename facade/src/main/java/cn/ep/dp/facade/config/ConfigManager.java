package cn.ep.dp.facade.config;

/**
 * 示意配置管理，就是负责读取配置文件，并把配置文件的内容设置到配置Model中去
 *
 * @author lhl
 */
public class ConfigManager {

    private static ConfigManager configManager = null;

    private static ConfigModel configModel = null;

    private ConfigManager() {

    }

    public static ConfigManager getInstance() {
        if (configManager == null) {
            configManager = new ConfigManager();
            configModel = new ConfigModel();
        }
        return configManager;
    }

    /**
     * 获取配置的数据
     *
     * @return 配置的数据
     */
    public ConfigModel getConfigData() {
        return configModel;
    }

}
