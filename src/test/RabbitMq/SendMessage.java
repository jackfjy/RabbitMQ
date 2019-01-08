import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 发送消息
 * @ClassName PACKAGE_NAME.SendMessage
 * @Author: wangZai
 * @Date: 2018/12/23 18:04
 * @Version 1.0
 * @Description TODO
 */
public class SendMessage {
    public static void main(final String... args){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
        template.convertAndSend("Hello World1");
        ctx.close();
    }
}
