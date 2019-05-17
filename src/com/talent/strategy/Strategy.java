package com.talent.strategy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 策略接口
 * @create: 2019-05-17 15:15
 */
public interface Strategy {

    /**
     * 充值接口
     * @param charge 充值金额
     * @param type 充值类型
     * @return
     */
    Double calRecharge(Double charge, RechargeTypeEnum type);
}
