package cn.ep.dp.visitor.customer.impl;

import cn.ep.dp.visitor.Visitor;
import cn.ep.dp.visitor.customer.BaseCustomer;

/**
 * 企业客户
 *
 * @author lhl
 */
public class EnterpriseCustomer extends BaseCustomer {

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 联系电话
     */
    private String linkTelephone;

    /**
     * 注册地址
     */
    private String registerAddress;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEnterpriseCustomer(this);
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkTelephone() {
        return linkTelephone;
    }

    public void setLinkTelephone(String linkTelephone) {
        this.linkTelephone = linkTelephone;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

}
