package com.talent.proxy.dynamic;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 动态代理：实现阶段不用关心代理是哪个，而在运行阶段指定具体哪个代理
 * @create: 2019-05-10 14:02
 */
public interface IGamePlayer {

    /**
     * 登录接口
     * @param username
     * @param password
     */
    void login(String username, String password);

    /**
     * 杀怪接口
     */
    void killBoss();

    /**
     * 升级接口
     */
    void upGrade();
}
