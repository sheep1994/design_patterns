package com.talent.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 邮箱实例实现接口
 * @create: 2019-05-09 16:33
 */
public class MyMessageEmail extends MyAbstractMessage {

    @Override
    public void sendMessage() throws Exception {
        if (getMessageParam() == null || getMessageParam().get("EMAIL") == null || "".equals(getMessageParam().get("EMAIL"))) {
            throw new Exception("发送短信,需要传入EMAIL参数");
        }

        System.out.println("我是邮件，发送通知给" + getMessageParam().get("EMAIL"));
    }
}
