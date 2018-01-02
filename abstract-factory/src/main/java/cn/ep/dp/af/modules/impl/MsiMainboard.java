package cn.ep.dp.af.modules.impl;

import cn.ep.dp.af.modules.MainboardApi;

/**
 * 微星主板
 *
 * @author lhl
 */
public class MsiMainboard implements MainboardApi {

    /**
     * CPU插槽的孔数
     */
    private int cpuHoles;

    /**
     * 构造方法,传入CPU插槽的孔数
     *
     * @param cpuHoles CPU插槽的孔数
     */
    public MsiMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("now in MSIMainboard,cpuHoles=" + cpuHoles);
    }

}
