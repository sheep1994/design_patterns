package com.talent.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: OA实例实现接口
 * @create: 2019-05-09 16:34
 */
public class MyMessageOaToda extends MyAbstractMessage {

    @Override
    public void sendMessage() throws Exception {
        if (getMessageParam() == null || getMessageParam().get("OAUSERNAME") == null || "".equals(getMessageParam().get("OAUSERNAME"))) {
            throw new Exception("发送OA待办,需要传入OAUSERNAME参数");
        }

        System.out.println("我是OA待办，发送通知给" + getMessageParam().get("OAUSERNAME"));
    }
}
