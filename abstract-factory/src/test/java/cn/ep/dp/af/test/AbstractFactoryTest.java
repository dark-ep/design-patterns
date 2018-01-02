package cn.ep.dp.af.test;

import cn.ep.dp.af.engineer.ComputerEngineer;
import cn.ep.dp.af.factory.AbstractFactory;
import cn.ep.dp.af.factory.impl.*;
import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

    @Test
    void testSchema1() {
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory schema = new Schema1();
        engineer.makeComputer(schema);
    }

    @Test
    void testSchema2() {
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory schema = new Schema2();
        engineer.makeComputer(schema);
    }

}
