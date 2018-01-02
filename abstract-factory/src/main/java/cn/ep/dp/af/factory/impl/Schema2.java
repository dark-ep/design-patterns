package cn.ep.dp.af.factory.impl;

import cn.ep.dp.af.factory.*;
import cn.ep.dp.af.modules.impl.*;

/**
 * 装机方案2:AMD的CPU+微星的主板
 *
 * @author lhl
 */
public class Schema2 implements AbstractFactory {

    @Override
    public Object createModule(ModuleType type) {
        switch (type) {
            case CPU:
                return new AmdCpu(939);
            case Mainboard:
                return new MsiMainboard(939);
            case Memory:
                return null;
            default:
                throw new NullPointerException("no module");
        }
    }

}
