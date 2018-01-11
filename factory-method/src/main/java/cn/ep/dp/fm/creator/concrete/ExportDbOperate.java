package cn.ep.dp.fm.creator.concrete;

import cn.ep.dp.fm.creator.ExportOperate;
import cn.ep.dp.fm.product.ExportFileApi;
import cn.ep.dp.fm.product.impl.ExportDb;

/**
 * 具体的创建器实现对象，实现创建导出成数据库备份文件形式的对象
 *
 * @author lhl
 */
public class ExportDbOperate extends ExportOperate {

    protected ExportFileApi factoryMethod() {
        // 创建导出成数据库备份文件新式的对象
        return new ExportDb();
    }

}
