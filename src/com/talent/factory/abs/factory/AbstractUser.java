package com.talent.factory.abs.factory;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 抽象工厂产品类
 * @create: 2019-06-03 17:30
 */
public abstract class AbstractUser {

    /**
     * 插入数据
     * @param user
     * @return
     */
    protected abstract User insert(User user);

    /**
     * 获取记录
     * @param id
     */
    protected abstract void getUserById(Integer id);
}
