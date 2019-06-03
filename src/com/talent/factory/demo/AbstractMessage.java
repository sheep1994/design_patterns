package com.talent.factory.demo;

import java.util.Map;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂类中的抽象产品实现类
 * @create: 2019-05-31 15:11
 */
public abstract class AbstractMessage implements IMessage {

    private Map<String, Object> messageParam;

    public Map<String, Object> getMessageParam() {
        return messageParam;
    }

    public void setMessageParam(Map<String, Object> messageParam) {
        this.messageParam = messageParam;
    }
}
