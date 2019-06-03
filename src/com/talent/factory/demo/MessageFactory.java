package com.talent.factory.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂类中实现工厂接口的类
 * @create: 2019-05-31 15:22
 */
public class MessageFactory implements IMessageFactory {

    @Override
    public <T extends IMessage> T createInstance(MessageEnum messageEnum) {
        if (messageEnum == null) {
            return null;
        }
        IMessage message = null;
        Map<String, Object> messageParam = new HashMap<>();
        switch (messageEnum) {
            case SMS:
                message = new MessageSms();
                messageParam.put("PHONENUM", "123456789");
                break;
            case EMAIL:
                message = new MessageEmail();
                messageParam.put("EMAIL", "test@test.com");
                break;
            case OA:
                message = new MessageOaToda();
                messageParam.put("OAUSERNAME", "testUser");
                break;
            default:
                message = new MessageSms();
                messageParam.put("EMAIL", "test@test.com");
                break;
        }
        ((AbstractMessage) message).setMessageParam(messageParam);
        return (T) message;
    }
}
