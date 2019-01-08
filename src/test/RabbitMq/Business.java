import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName PACKAGE_NAME.Business
 * @Author: wangZai
 * @Date: 2018/12/23 21:13
 * @Version 1.0
 * @Description TODO
 */
public class Business {

    public void userRegister(){
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        RabbitTemplate template = context.getBean(RabbitTemplate.class);

        Mail mail = new Mail();
        mail.setTo("1562514938@qq.com");
        mail.setSubject("测试RabbitMQ");
        mail.setContent("测试RabbitMQ内容。。。。。。");
        template.convertAndSend(mail);
        context.close();

    }

    public static void main(String[] args) {
        Business business = new Business();
        business.userRegister();
    }
}
