package cn.ep.dp.flyweight.manager;

import java.util.*;

/**
 * @author lhl
 */
public class TempDb {

    private static final int TOTAL = 3;
    public static Collection<String> colDB = new ArrayList<>();
    public static Map<String, String[]> mapDB = new HashMap<>();

    static {
        colDB.add("张三,人员列表,查看,1");
        colDB.add("李四,人员列表,查看,1");
        colDB.add("李四,操作薪资数据,,2");
        for (int i = 0; i < TOTAL; i++) {
            colDB.add("张三" + i + ",人员列表,查看,1");
        }

        mapDB.put("操作薪资数据", new String[]{"薪资数据,查看", "薪资数据,修改"});
    }

}
