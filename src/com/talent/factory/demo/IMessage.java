package com.talent.factory.demo;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂类中的产品接口（一个接口，多个抽象类，多个实现类）
 * @create: 2019-05-31 15:11
 */
public interface IMessage {

    /**
     * 发送消息
     * @throws Exception
     */
    void sendMessage() throws Exception;
}
