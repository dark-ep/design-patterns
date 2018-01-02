package cn.ep.dp.bridge.message.impl;

import cn.ep.dp.bridge.message.*;

/**
 * 普通消息
 *
 * @author lhl
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        // 直接调用父类的方法
        super.sendMessage(message, toUser);
    }

}
