package com.talent.singleton;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 饿汉式单例模式
 * @create: 2019-05-09 09:41
 */
public class HungrySingleton {

    /**
     * 私有的实例化对象
     */
    private static HungrySingleton singleton = new HungrySingleton();

    /**
     * 私有构造器
     */
    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return singleton;
    }




}
