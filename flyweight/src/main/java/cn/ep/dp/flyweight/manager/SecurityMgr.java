package cn.ep.dp.flyweight.manager;

import cn.ep.dp.flyweight.*;
import cn.ep.dp.flyweight.impl.UnsharedConcreteFlyweight;

import java.util.*;

/**
 * 安全管理
 *
 * @author lhl
 */
public class SecurityMgr {

    private static final String TYPE = "2";
    private static final String REGEX = ",";
    private static SecurityMgr securityMgr = new SecurityMgr();
    /**
     * 用来保存登录人员对应的权限
     */
    private Map<String, Collection<Flyweight>> map = new HashMap<>();

    private SecurityMgr() {

    }

    public static SecurityMgr getInstanse() {
        return securityMgr;
    }

    /**
     * 模拟登录功能
     *
     * @param user 登录用户
     */
    public void login(String user) {
        Collection<Flyweight> col = queryByUser(user);
        map.put(user, col);
    }

    /**
     * 判断某用户对某个安全实体是否拥有某种权限
     *
     * @param user           被检测权限的用户
     * @param securityEntity 安全实体
     * @param permit         权限
     * @return true表示拥有相应权限，false表示没有相应权限
     */
    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> col = map.get(user);
        if (col == null || col.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }
        for (Flyweight fm : col) {
            System.out.println("fm=" + fm);
            if (fm.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 从数据库获取默认所拥有的权限
     *
     * @param user 需要获取所拥有的权限的人员
     * @return 某人所拥有的权限
     */
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<>();
        for (String s : TempDb.colDB) {
            String[] ss = s.split(REGEX);
            if (ss[0].equals(user)) {
                Flyweight fm;
                if (TYPE.equals(ss[3])) {
                    fm = new UnsharedConcreteFlyweight();
                    String[] strings = TempDb.mapDB.get(ss[1]);
                    for (String string : strings) {
                        Flyweight flyweight = FlyweightFactory.getInstance().getFlyweight(string);
                        fm.add(flyweight);
                    }
                } else {
                    String key = ss[1] + "," + ss[2];
                    fm = FlyweightFactory.getInstance().getFlyweight(key);
                }
                col.add(fm);
            }
        }
        return col;
    }
}
