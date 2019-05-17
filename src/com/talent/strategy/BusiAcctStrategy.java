package com.talent.strategy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 商户账号充值接口
 * @create: 2019-05-17 15:27
 */
public class BusiAcctStrategy implements Strategy {

    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge * 0.90;
    }
}
