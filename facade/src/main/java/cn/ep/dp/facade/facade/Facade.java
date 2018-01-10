package cn.ep.dp.facade.facade;

import cn.ep.dp.facade.business.Business;
import cn.ep.dp.facade.dao.Dao;
import cn.ep.dp.facade.presentation.Presentation;

/**
 * 代码声称子系统的外观对象
 *
 * @author lhl
 */
public class Facade {

    /**
     * 客户端需要的，一个简单的调用代码生成的功能
     */
    public void generate() {
        Presentation presentation = new Presentation();
        presentation.generate();
        Business business = new Business();
        business.generate();
        Dao dao = new Dao();
        dao.generate();
    }

}
