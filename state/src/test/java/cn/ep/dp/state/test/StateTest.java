package cn.ep.dp.state.test;

import cn.ep.dp.state.LeaveRequestContext;
import cn.ep.dp.state.impl.ProjectManagerState;
import cn.ep.dp.state.model.LeaveRequestModel;
import org.junit.jupiter.api.Test;

class StateTest {

    @Test
    void testLeave() {
        //创建业务对象，并设置业务数据
        LeaveRequestModel lrm = new LeaveRequestModel();
        lrm.setUser("小李");
        lrm.setBeginDate("2010-02-08");
        lrm.setLeaveDays(5);
        lrm.setResult("同意");

        //创建上下文对象
        LeaveRequestContext request = new LeaveRequestContext();
        //为上下文对象设置业务数据对象
        request.setBusinessVO(lrm);
        //配置上下文，作为开始的状态，以后就不管了
        request.setState(new ProjectManagerState());

        //请求上下文，让上下文开始处理工作
        request.doWork();
    }

}
