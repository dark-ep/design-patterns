package cn.ep.dp.af.modules.impl;

import cn.ep.dp.af.modules.CpuApi;

/**
 * AMD的CPU
 *
 * @author lhl
 */
public class AmdCpu implements CpuApi {

    /**
     * CPU的针脚数目
     */
    private int pins;

    /**
     * 构造方法,传入CPU的针脚数目
     *
     * @param pins CPU的针脚数目
     */
    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("now in AMD CPU,pins=" + pins);
    }

}
