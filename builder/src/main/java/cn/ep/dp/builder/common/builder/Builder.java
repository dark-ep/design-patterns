package cn.ep.dp.builder.common.builder;

import cn.ep.dp.builder.common.exportmodel.*;

import java.util.*;

/**
 * 生成器接口，定义创建一个输出文件对象所需的各个部件的操作
 *
 * @author lhl
 */
public interface Builder {

    /**
     * 构建输出文件的Header部分
     *
     * @param ehm 文件头的内容
     */
    void buildHeader(ExportHeaderModel ehm);

    /**
     * 构件输出文件的Body部分
     *
     * @param mapData 要输出的数据的内容
     */
    void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    /**
     * 构件输出文件的Footer部分
     *
     * @param efm 文件尾的内容
     */
    void buildFooter(ExportFooterModel efm);
}
