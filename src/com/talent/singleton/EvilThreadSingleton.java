package com.talent.singleton;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 懒汉式单例模式（线程安全，效率低）
 * @create: 2019-05-08 18:34
 */
public class EvilThreadSingleton {

    /**
     * 声明对象
     */
    private static EvilThreadSingleton singleton;

    /**
     * 私有构造器
     */
    private EvilThreadSingleton() {}

    /**
     * 提供获取实例的方法
     */
    public static synchronized EvilThreadSingleton getInstance() {
        if (singleton == null) {
            singleton = new EvilThreadSingleton();
        }
        return singleton;
    }
}
