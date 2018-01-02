package cn.ep.dp.bridge.message.impl;

import cn.ep.dp.bridge.message.*;

/**
 * 特急消息
 *
 * @author lhl
 */
public class SpecialUrgencyMessage extends AbstractMessage {

    public SpecialUrgencyMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "特急：" + message;
        super.sendMessage(message, toUser);
    }

    /**
     * 执行催促业务，发布催促的信息
     *
     * @param messageId 被催促的消息的编号
     */
    public void hurry(String messageId) {
        // 执行催促的业务，发出催促的信息
    }

}
