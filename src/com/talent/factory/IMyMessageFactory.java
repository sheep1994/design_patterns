package com.talent.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 抽象工厂类
 * @create: 2019-05-09 16:20
 */
public interface IMyMessageFactory {

    /**
     * 创建工厂对象
     * @param messageType
     * @return
     */
    MyAbstractMessage createMessage(MessageEnum messageType);
}
