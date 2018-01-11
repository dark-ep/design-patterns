package cn.ep.dp.fm.product.impl;

import cn.ep.dp.fm.product.ExportFileApi;

/**
 * 导出成xml文件对象
 *
 * @author lhl
 */
public class ExportXml implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到XML文件");
        return true;
    }

}
