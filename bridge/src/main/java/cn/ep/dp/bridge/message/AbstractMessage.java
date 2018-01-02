package cn.ep.dp.bridge.message;

/**
 * 抽象的消息对象
 *
 * @author lhl
 */
public abstract class AbstractMessage {

    /**
     * 持有一个实现消息的对象
     */
    private MessageImplementor implementor;

    /**
     * 构造方法，传入实现部分的对象
     *
     * @param implementor 实现部分的对象
     */
    public AbstractMessage(MessageImplementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 发送消息，转调实现部分的方法
     *
     * @param message 要发送的消息内容
     * @param toUser  消息发送的目的人员
     */
    public void sendMessage(String message, String toUser) {
        this.implementor.send(message, toUser);
    }

}
