package cn.ep.dp.af.engineer;

import cn.ep.dp.af.factory.*;
import cn.ep.dp.af.modules.*;

/**
 * 装机工程师
 *
 * @author lhl
 */
public class ComputerEngineer {

    private CpuApi cpu;

    private MainboardApi mainboard;

    private MemoryApi memory;

    /**
     * 装机过程
     *
     * @param schema 装机方案
     */
    public void makeComputer(AbstractFactory schema) {
        // 1:首先准备好装机所需要的配件
        prepareHardwares(schema);
        // 2:组装电脑
        // 3:测试电脑
        // 4:交付客户
    }

    /**
     * 准备硬件
     *
     * @param schema 模式
     */
    private void prepareHardwares(AbstractFactory schema) {
        this.cpu = (CpuApi) schema.createModule(ModuleType.CPU);
        this.mainboard = (MainboardApi) schema.createModule(ModuleType.Mainboard);
        this.memory = (MemoryApi) schema.createModule(ModuleType.Memory);

        this.cpu.calculate();
        this.mainboard.installCPU();
        if (memory != null) {
            this.memory.cacheData();
        }
    }

}
