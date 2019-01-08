import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.net.Authenticator;
import java.util.Properties;

/**
 * @ClassName PACKAGE_NAME.MailListener
 * @Author: wangZai
 * @Date: 2018/12/23 21:37
 * @Version 1.0
 * @Description TODO
 */
public class MailListener implements MessageListener {
    public void onMessage(Message message) {
        //取出json消息
        String messages = new String(message.getBody());
        //jackson的实体类
        ObjectMapper mapper = new ObjectMapper();
        try {

            Mail mail = mapper.readValue(messages,Mail.class);
            System.out.println("已接收到Mail:"+mail);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void send(Mail mail){
        System.out.println("已发送！");
    }
}
