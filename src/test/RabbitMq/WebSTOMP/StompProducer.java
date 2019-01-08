package WebSTOMP;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName WebSTOMP.StompProducer
 * @Author: wangZai
 * @Date: 2018/12/23 23:05
 * @Version 1.0
 * @Description TODO
 */
public class StompProducer {
    public static void main(String[] args) {
        ConnectionFactory cf = new ConnectionFactory();
        cf.setUsername("guest");
        cf.setPassword("guest");

        cf.setHost("localhost");
        cf.setVirtualHost("ctest");

        //创建到代理服务器的连接
        try {
            Connection connection = cf.newConnection();
            Channel channel = connection.createChannel();

            String exchangeName = "abc";
            //声明topic
            channel.exchangeDeclare(exchangeName,"topic");
            String routingKey = "shopping2.discount";

            String message = "<a href=\"https://www.baidu.com\" target=\"_blank\" >哈哈哈哈哈1</a>";

            channel.basicPublish(exchangeName,routingKey,null,message.getBytes());
            channel.close();
            connection.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
