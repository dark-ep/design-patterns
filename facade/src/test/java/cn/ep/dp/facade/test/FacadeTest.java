package cn.ep.dp.facade.test;

import cn.ep.dp.facade.facade.Facade;
import org.junit.jupiter.api.Test;

class FacadeTest {

    @Test
    void testGenerate() {
        Facade facade = new Facade();
        facade.generate();
    }

}
