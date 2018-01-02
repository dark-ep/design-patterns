package cn.ep.dp.af.factory.impl;

import cn.ep.dp.af.factory.*;
import cn.ep.dp.af.modules.impl.*;

/**
 * 装机方案1:Intel的CPU+技嘉的主板
 *
 * @author lhl
 */
public class Schema1 implements AbstractFactory {

    @Override
    public Object createModule(ModuleType type) {
        switch (type) {
            case CPU:
                return new IntelCpu(1156);
            case Mainboard:
                return new GaMainboard(1156);
            case Memory:
                return new HyMemory();
            default:
                throw new NullPointerException("no module");
        }
    }

}
