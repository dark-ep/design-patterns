package cn.ep.dp.bridge.message.impl;

import cn.ep.dp.bridge.message.*;

/**
 * 加急消息
 *
 * @author lhl
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    /**
     * 扩展自己的新功能：监控莫消息的处理过程
     *
     * @param messageId 被监控的消息的编号
     * @return 包含监控到的数据对象
     */
    public Object watch(String messageId) {
        return null;
    }

}
