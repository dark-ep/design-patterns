package cn.ep.dp.mediator;

import cn.ep.dp.mediator.colleague.*;

import java.util.*;

/**
 * @author lhl
 */
public class DepUserMediator {

    private static DepUserMediator mediator = new DepUserMediator();
    /**
     * 测试用，记录部门和人员的关系
     */
    private Collection<DepUserModel> depUserModels = new ArrayList<>();

    private DepUserMediator() {
        // 调用初始化测试数据的功能
        initTestData();
    }

    public static DepUserMediator getInstance() {
        return mediator;
    }

    /**
     * 初始化测试数据
     */
    private void initTestData() {
        DepUserModel du1 = new DepUserModel();
        du1.setDepId("d1");
        du1.setUserId("u1");
        du1.setDepUserId("du1");

        DepUserModel du2 = new DepUserModel();
        du2.setDepId("d1");
        du2.setUserId("u2");
        du2.setDepUserId("du2");

        DepUserModel du3 = new DepUserModel();
        du3.setDepId("d2");
        du3.setUserId("u3");
        du3.setDepUserId("du3");

        DepUserModel du4 = new DepUserModel();
        du4.setDepId("d2");
        du4.setUserId("u4");
        du4.setDepUserId("du4");

        DepUserModel du5 = new DepUserModel();
        du5.setDepId("d2");
        du5.setUserId("u1");
        du5.setDepUserId("du5");

        depUserModels.add(du1);
        depUserModels.add(du2);
        depUserModels.add(du3);
        depUserModels.add(du4);
        depUserModels.add(du5);
    }

    /**
     * 完成因撤销部门的操作所引起的与人员的交互，需要去除相应的关系
     *
     * @param depId 被撤销的部门对象的编号
     * @return 是否已经正确地处理了因撤销部门所引起的与人员的交互
     */
    public boolean deleteDep(String depId) {
        // 1：到记录部门和人缘关系的集合里面，寻找跟这个部门相关的人员
        // 设置一个临时的集合，记录需要清除的关系对象
        Collection<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du : depUserModels) {
            if (du.getDepId().equals(depId)) {
                // 2：需要把这个相关的记录去掉，先记录下来
                tempCol.add(du);
            }
        }
        // 3：从关系集合里面清除掉这些关系
        depUserModels.removeAll(tempCol);
        return true;
    }

    /**
     * 完成因为人员离职引起的与部门的交互
     *
     * @param userId 离职人员的编号
     * @return 是否正确处理了因人员离职引起的与部门的交互
     */
    public boolean deleteUser(String userId) {
        // 1：到记录部门和人缘关系的集合里面，寻找跟这个人员相关的部门
        // 设置一个临时的集合，记录需要清除的关系对象
        Collection<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du : depUserModels) {
            if (du.getUserId().equals(userId)) {
                // 2：需要把这个相关的记录去掉，先记录下来
                tempCol.add(du);
            }
        }
        // 3：从关系集合里面清除掉这些关系
        depUserModels.removeAll(tempCol);
        return true;
    }

    /**
     * 测试用，在内部打印显示一个部门下的所有人员
     *
     * @param dep 部门对象
     */
    public void showDepUsers(Dep dep) {
        for (DepUserModel du : depUserModels) {
            if (du.getDepId().equals(dep.getDepId())) {
                System.out.println("部门编号=" + dep.getDepId() + "下面拥有人员，其编号是：" + du.getUserId());
            }
        }
    }

    /**
     * 测试用，在内部打印显示一个人员所属的部门
     *
     * @param user 人员对象
     */
    public void showUserDeps(User user) {
        for (DepUserModel du : depUserModels) {
            if (du.getUserId().equals(user.getUserId())) {
                System.out.println("人员编号=" + user.getUserId() + "属于部门编号是：" + du.getDepId());
            }
        }
    }

}
