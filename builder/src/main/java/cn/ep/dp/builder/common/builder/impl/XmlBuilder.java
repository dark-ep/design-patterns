package cn.ep.dp.builder.common.builder.impl;

import cn.ep.dp.builder.common.builder.Builder;
import cn.ep.dp.builder.common.exportmodel.*;

import java.util.*;

/**
 * 实现导出数据到XML文件的生成器对象
 *
 * @author lhl
 */
public class XmlBuilder implements Builder {

    /**
     * 用来记录构建的文件的内容，相当于产品
     */
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append("<?xml version='1.0' encoding='UTF-8'?>\n");
        buffer.append("<Report>\n");
        buffer.append("	<Header>\n");
        buffer.append("		<DepId>");
        buffer.append(ehm.getDepId());
        buffer.append("</DepId>\n");
        buffer.append("		<ExportDate>");
        buffer.append(ehm.getExportDate());
        buffer.append("</ExportDate>\n");
        buffer.append("	</Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        buffer.append("	<Body>\n");
        for (String tblName : mapData.keySet()) {
            // 先拼接表名称
            buffer.append("		<Datas TableName=\"");
            buffer.append(tblName);
            buffer.append("\">\n");
            // 然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                buffer.append("			<Data>\n");
                buffer.append("				<ProductId>");
                buffer.append(edm.getProductId());
                buffer.append("</ProductId>\n");
                buffer.append("				<Price>");
                buffer.append(edm.getPrice());
                buffer.append("</Price>\n");
                buffer.append("				<Amount>");
                buffer.append(edm.getAmount());
                buffer.append("</Amount>\n");
                buffer.append("			</Data>\n");
            }
            buffer.append("		</Datas>\n");
        }
        buffer.append("	</Body>\n");
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append("	<Footer>\n");
        buffer.append("		<ExportUser>");
        buffer.append(efm.getExportUser());
        buffer.append("</ExportUser>\n");
        buffer.append("	</Footer>\n");
        buffer.append("</Report>\n");
    }

    public StringBuffer getResult() {
        return buffer;
    }

}
