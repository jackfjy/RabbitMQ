import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * 消费消息
 * @ClassName PACKAGE_NAME.MQListener
 * @Author: wangZai
 * @Date: 2018/12/23 13:15
 * @Version 1.0
 * @Description TODO
 */
public class MQListener implements MessageListener {

    public void onMessage(Message message) {
        String messageBody = new String(message.getBody());//接收到的消息体
        System.out.println("接收到的消息："+messageBody+"");
    }
}
