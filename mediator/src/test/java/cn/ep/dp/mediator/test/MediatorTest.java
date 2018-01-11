package cn.ep.dp.mediator.test;

import cn.ep.dp.mediator.DepUserMediator;
import cn.ep.dp.mediator.colleague.*;
import org.junit.jupiter.api.Test;

class MediatorTest {

    @Test
    void testDepUser() {
        DepUserMediator mediator = DepUserMediator.getInstance();
        Dep dep = new Dep();
        dep.setDepId("d1");
        Dep dep2 = new Dep();
        dep2.setDepId("d2");
        User user = new User();
        user.setUserId("u1");

        System.out.println("撤销部门前----------------------------------");
        mediator.showUserDeps(user);
        dep.deleteDep();
        System.out.println("撤销部门后----------------------------------");
        mediator.showUserDeps(user);

        System.out.println("-------------------------------------------");

        System.out.println("人员离职前----------------------------------");
        mediator.showDepUsers(dep2);
        user.dimission();
        System.out.println("人员离职后----------------------------------");
        mediator.showDepUsers(dep2);
    }

}
