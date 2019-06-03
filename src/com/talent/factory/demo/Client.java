package com.talent.factory.demo;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 测试类
 * @create: 2019-05-31 15:26
 */
public class Client {

    public static void main(String[] args) throws Exception {

        IMessage message = null;
        IMessageFactory factory = new MessageFactory();

        message = factory.createInstance(MessageEnum.SMS);
        message.sendMessage();
    }
}
