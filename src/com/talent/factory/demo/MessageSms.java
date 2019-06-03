package com.talent.factory.demo;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂类中的具体产品实现类
 * @create: 2019-05-31 15:16
 */
public class MessageSms extends AbstractMessage {
    @Override
    public void sendMessage() throws Exception {
        if (getMessageParam() == null || getMessageParam().get("PHONENUM") == null || "".equals(getMessageParam().get("PHONENUM"))) {
            throw new Exception("发送短信,需要传入PHONENUM参数");
        }

        System.out.println("我是短信，发送通知给" + getMessageParam().get("PHONENUM"));
    }
}
