package cn.ep.dp.mediator.colleague;

import cn.ep.dp.mediator.DepUserMediator;

/**
 * 部门类
 *
 * @author lhl
 */
public class Dep {

    /**
     * 描述部门编号
     */
    private String depId;

    /**
     * 描述部门名称
     */
    private String depName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * 撤销部门
     *
     * @return 是否撤销成功
     */
    public boolean deleteDep() {
        // 1：要先通过中介者去除掉所有与这个部门相关的部门和人员的关系
        DepUserMediator mediator = DepUserMediator.getInstance();
        mediator.deleteDep(depId);
        // 2：然后才能真正的清除掉这个部门
        // 在实际开发中，这些业务功能可能会做到业务层去
        // 而且实际开发中对于已经使用的业务数据通常是不会被删除的
        // 而是会被作为历史数据保留
        return true;
    }

}
