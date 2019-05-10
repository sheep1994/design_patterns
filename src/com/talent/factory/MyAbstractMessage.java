package com.talent.factory;

import java.util.Map;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 默认实例接口实现
 * @create: 2019-05-09 16:25
 */
public abstract class MyAbstractMessage implements IMyMessage {

    private Map<String, Object> messageParam;

    public Map<String, Object> getMessageParam() {
        return messageParam;
    }

    public void setMessageParam(Map<String, Object> messageParam) {
        this.messageParam = messageParam;
    }
}
