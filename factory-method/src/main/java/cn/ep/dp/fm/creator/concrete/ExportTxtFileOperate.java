package cn.ep.dp.fm.creator.concrete;

import cn.ep.dp.fm.creator.ExportOperate;
import cn.ep.dp.fm.product.ExportFileApi;
import cn.ep.dp.fm.product.impl.ExportTxtFile;

/**
 * 具体的创建其器实现对象，实现创建导出成文本文件格式的对象
 *
 * @author lhl
 */
public class ExportTxtFileOperate extends ExportOperate {

    protected ExportFileApi factoryMethod() {
        // 创建导出成文本文件格式的对象
        return new ExportTxtFile();
    }

}
