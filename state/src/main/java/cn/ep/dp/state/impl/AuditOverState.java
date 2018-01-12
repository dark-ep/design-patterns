package cn.ep.dp.state.impl;

import cn.ep.dp.state.StateMachine;
import cn.ep.dp.state.model.LeaveRequestModel;

/**
 * 处理审核结束的类
 *
 * @author lhl
 */
public class AuditOverState implements LeaveRequestState {

    @Override
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();

        //业务处理，在数据里面记录整个流程结束

        System.out.println(lrm.getUser() + "，你的请假申请[从" + lrm.getBeginDate() +
                "开始请假" + lrm.getLeaveDays() + "天]已经审核结束，结果是：" + lrm.getResult());
    }

}
