package com.talent.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂类实现
 * @create: 2019-05-09 16:23
 */
public class MyMessageFactory implements IMyMessageFactory {


    @Override
    public MyAbstractMessage createMessage(MessageEnum messageType) {

        IMyMessage message;
        Map<String, Object> messageParam = new HashMap<>();

        switch (messageType) {
            case SMS:
                message = new MyMessageSms();
                messageParam.put("PHONENUM", "123456789");
                break;
            case OA:
                message = new MyMessageOaToda();
                messageParam.put("OAUSERNAME", "testUser");
                break;
            case EMAIL:
                message = new MyMessageEmail();
                messageParam.put("EMAIL", "test@test.com");
                break;
            default:
                message = new MyMessageEmail();
                messageParam.put("EMAIL", "test@test.com");
                break;
        }

        ((MyAbstractMessage) message).setMessageParam(messageParam);
        return (MyAbstractMessage) message;
    }
}
