package com.talent.factory.demo;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂类中的工厂接口
 * @create: 2019-05-31 15:17
 */
public interface IMessageFactory {

    /**
     * 创建实例的工厂方法
     * @param messageEnum
     * @param <T>
     * @return
     */
    <T extends IMessage> T createInstance(MessageEnum messageEnum);
}
