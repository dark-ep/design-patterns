package cn.ep.dp.cor.impl;

import cn.ep.dp.cor.BaseSaleHandler;
import cn.ep.dp.cor.model.SaleModel;

/**
 * 真正处理销售的业务功能的职责对象
 *
 * @author lhl
 */
public class SaleMgr extends BaseSaleHandler {

    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //进行真正的业务逻辑处理
        System.out.println(user + "保存了" + customer + "购买 " + saleModel + " 的销售数据");
        return true;
    }

}
