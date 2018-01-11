package cn.ep.dp.fm.product.impl;

import cn.ep.dp.fm.product.ExportFileApi;

/**
 * 导出成文本文件格式的对象
 *
 * @author lhl
 */
public class ExportTxtFile implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到文本文件");
        return true;
    }

}
