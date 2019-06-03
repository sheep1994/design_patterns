package com.talent.factory.demo;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂类中具体产品实现类
 * @create: 2019-05-31 15:13
 */
public class MessageEmail extends AbstractMessage {

    @Override
    public void sendMessage() throws Exception {
        if (getMessageParam() == null || getMessageParam().get("EMAIL") == null || "".equals(getMessageParam().get("EMAIL"))) {
            throw new Exception("发送短信,需要传入EMAIL参数");
        }
        System.out.println("我是邮件，发送通知给" + getMessageParam().get("EMAIL"));
    }
}
