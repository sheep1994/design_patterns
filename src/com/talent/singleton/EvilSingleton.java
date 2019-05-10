package com.talent.singleton;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 懒汉式单例模式（线程不安全，多线程不能正常工作）
 * @create: 2019-05-08 18:20
 */
public class EvilSingleton {

    /**
     * 声明对象
     */
    private static EvilSingleton singleton;

    /**
     * 私有的构造方法
     */
    private EvilSingleton() {}

    /**
     * 提供一个获取对象实例的方法
     * @return
     */
    public static EvilSingleton getInstance() {
        if (singleton == null) {
            singleton = new EvilSingleton();
        }
        return singleton;
    }


}
