package com.talent.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 短信实例接口实现
 * @create: 2019-05-09 16:29
 */
public class MyMessageSms extends MyAbstractMessage {

    @Override
    public void sendMessage() throws Exception {
        if (getMessageParam() == null || getMessageParam().get("PHONENUM") == null || "".equals(getMessageParam().get("PHONENUM"))) {
            throw new Exception("发送短信,需要传入PHONENUM参数");
        }

        System.out.println("我是短信，发送通知给" + getMessageParam().get("PHONENUM"));
    }
}
