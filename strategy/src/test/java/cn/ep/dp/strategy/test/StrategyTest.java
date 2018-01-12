package cn.ep.dp.strategy.test;

import cn.ep.dp.strategy.context.LogContext;
import org.junit.jupiter.api.Test;

class StrategyTest {

    @Test
    void testLog() {
        LogContext log = new LogContext();
        log.log("记录日志");
        log.log("再次记录日志");
    }
}

