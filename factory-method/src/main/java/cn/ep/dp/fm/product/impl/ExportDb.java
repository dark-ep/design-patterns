package cn.ep.dp.fm.product.impl;

import cn.ep.dp.fm.product.ExportFileApi;

/**
 * 导出成数据库备份文件形式的对象
 *
 * @author lhl
 */
public class ExportDb implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到数据库备份文件");
        return true;
    }

}
