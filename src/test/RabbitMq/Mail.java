/**
 * @ClassName PACKAGE_NAME.Mail
 * @Author: wangZai
 * @Date: 2018/12/23 21:28
 * @Version 1.0
 * @Description TODO
 */
public class Mail {
    private String from;//发件人
    private String to;//收件人
    private String subject;//邮件标题
    private String content;//邮件内容

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
