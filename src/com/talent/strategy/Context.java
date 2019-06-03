package com.talent.strategy;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 策略上下文类,直接面向客户端的
 * @create: 2019-05-17 15:29
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Double calRecharge(Double charge, Integer type) {
        strategy = StrategyFactory.getInstance().creator(type);
        return strategy.calRecharge(charge, RechargeTypeEnum.valueOf(type));
    }
}
