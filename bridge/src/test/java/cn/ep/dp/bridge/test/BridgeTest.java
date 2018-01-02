package cn.ep.dp.bridge.test;

import cn.ep.dp.bridge.message.*;
import cn.ep.dp.bridge.message.impl.*;
import cn.ep.dp.bridge.message.type.*;
import org.junit.jupiter.api.Test;

class BridgeTest {

    @Test
    void testSendMessage() {
        // 创建具体站内短消息的实现对象
        MessageImplementor implementor = new MessageSms();
        // 创建一个普通消息对象
        AbstractMessage message = new CommonMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");
        // 创建一个紧急消息对象
        message = new UrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");
        // 创建一个特急消息对象
        message = new SpecialUrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");

        // 把实现方式切换成Email短消息
        implementor = new MessageEmail();
        message = new CommonMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");
        message = new UrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");
        message = new SpecialUrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");

        // 把实现方式切换成手机短信息
        implementor = new MessageMobile();
        message = new CommonMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");
        message = new UrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");
        message = new SpecialUrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");
    }

}
