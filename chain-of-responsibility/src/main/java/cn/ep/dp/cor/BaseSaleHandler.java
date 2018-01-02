package cn.ep.dp.cor;

import cn.ep.dp.cor.model.SaleModel;

/**
 * 定义职责对象的接口
 *
 * @author lhl
 */
public abstract class BaseSaleHandler {
    /**
     * 持有下一个处理请求的对象
     */
    protected BaseSaleHandler successor = null;

    /**
     * 设置下一个处理请求的对象
     *
     * @param successor 下一个处理请求的对象
     */
    public void setSuccessor(BaseSaleHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理保存销售信息的请求
     *
     * @param user      操作人员
     * @param customer  客户
     * @param saleModel 销售数据
     * @return 是否处理成功
     */
    public abstract boolean sale(String user, String customer, SaleModel saleModel);

}
