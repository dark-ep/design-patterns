package cn.ep.dp.builder.common.builder.impl;

import cn.ep.dp.builder.common.builder.Builder;
import cn.ep.dp.builder.common.exportmodel.*;

import java.util.*;

/**
 * 实现导出数据到文本文件的生成器对象
 *
 * @author lhl
 */
public class TxtBuilder implements Builder {

    /**
     * 用来记录构建的文件的内容，相当于产品
     */
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId());
        buffer.append(",");
        buffer.append(ehm.getExportDate());
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tblName : mapData.keySet()) {
            // 先拼接表名称
            buffer.append(tblName);
            buffer.append("\n");
            // 然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append(edm.getProductId());
                buffer.append(",");
                buffer.append(edm.getPrice());
                buffer.append(",");
                buffer.append(edm.getAmount());
                buffer.append("\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser());
    }

    public StringBuffer getResult() {
        return buffer;
    }

}
