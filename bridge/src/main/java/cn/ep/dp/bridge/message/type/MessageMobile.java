package cn.ep.dp.bridge.message.type;

import cn.ep.dp.bridge.message.MessageImplementor;

/**
 * 以手机短信的方式发送 消息
 *
 * @author lhl
 */
public class MessageMobile implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用手机短消息的方式，发送消息'" + message + "'给" + toUser);
    }

}
