package cn.ep.dp.cor.impl;

import cn.ep.dp.cor.BaseSaleHandler;
import cn.ep.dp.cor.model.SaleModel;

/**
 * 进行权限检查的职责对象
 *
 * @author lhl
 */
public class SaleSecurityCheck extends BaseSaleHandler {

    private final static String USER = "小李";

    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //进行权限检查，简单点，就小李能通过
        if (USER.equals(user)) {
            return this.successor.sale(user, customer, saleModel);
        } else {
            System.out.println("对不起" + user + "，你没有保存销售信息的权限");
            return false;
        }
    }

}