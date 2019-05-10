package com.talent.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂测试类
 * @create: 2019-05-09 17:12
 */
public class MyFactoryTest {

    public static void main(String[] args) throws  Exception {
        IMyMessageFactory messageFactory = new MyMessageFactory();
        IMyMessage message;

        message = messageFactory.createMessage(MessageEnum.SMS);
        message.sendMessage();

        message = messageFactory.createMessage(MessageEnum.OA);
        message.sendMessage();

        message = messageFactory.createMessage(MessageEnum.EMAIL);
        message.sendMessage();
    }
}
