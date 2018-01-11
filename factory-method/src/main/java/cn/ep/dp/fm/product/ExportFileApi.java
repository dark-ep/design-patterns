package cn.ep.dp.fm.product;

/**
 * 导出的文件对象的接口
 *
 * @author lhl
 */
public interface ExportFileApi {

    /**
     * 到处内容成为文件
     *
     * @param data 需要保存的数据
     * @return 是否导出成功
     */
    boolean export(String data);

}
