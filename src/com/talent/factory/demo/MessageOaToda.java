package com.talent.factory.demo;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 工厂类中的具体产品实现类
 * @create: 2019-05-31 15:14
 */
public class MessageOaToda extends AbstractMessage {

    @Override
    public void sendMessage() throws Exception {
        if (getMessageParam() == null || getMessageParam().get("OAUSERNAME") == null || "".equals(getMessageParam().get("OAUSERNAME"))) {
            throw new Exception("发送OA待办,需要传入OAUSERNAME参数");
        }

        System.out.println("我是OA待办，发送通知给" + getMessageParam().get("OAUSERNAME"));
    }
}
