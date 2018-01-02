package cn.ep.dp.af.modules.impl;

import cn.ep.dp.af.modules.MemoryApi;

/**
 * 现代内存
 *
 * @author lhl
 */
public class HyMemory implements MemoryApi {

    @Override
    public void cacheData() {
        System.out.println("now use HyMemory");
    }

}
