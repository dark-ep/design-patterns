package cn.ep.dp.fm.creator;

import cn.ep.dp.fm.product.ExportFileApi;
import cn.ep.dp.fm.product.impl.ExportXml;

/**
 * 扩展ExportOperate对象，加入可以导出的XML文件
 *
 * @author lhl
 */
public class ExportOperate2 extends ExportOperate {

    private static final int TYPE = 3;

    /**
     * 覆盖父类的工厂方法，创建导出的文件对象的接口对象
     *
     * @param type 用户选择的导出类型
     * @return 导出的文件对象的接口对象
     */
    @Override
    protected ExportFileApi factoryMethod(int type) {
        ExportFileApi api;
        // 可以全部覆盖，也可以选择自己感兴趣的覆盖
        // 这里只想添加自己新的实现，其他的不管
        if (type == TYPE) {
            api = new ExportXml();
        } else {
            // 其他的还是让父类来实现
            api = super.factoryMethod(type);
        }
        return api;
    }

}
