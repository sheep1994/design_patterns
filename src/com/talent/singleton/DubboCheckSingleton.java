package com.talent.singleton;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 双重校验锁式单例模式
 * @create: 2019-05-09 09:43
 */
public class DubboCheckSingleton {

    /**
     * 创建对象
     */
    private static DubboCheckSingleton singleton;

    /**
     * 私有构造器
     */
    private DubboCheckSingleton() {}

    public static DubboCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DubboCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DubboCheckSingleton();
                }
            }
        }
        return singleton;
    }

}
