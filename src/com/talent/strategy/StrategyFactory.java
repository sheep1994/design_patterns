package com.talent.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 策略工厂方法
 * @create: 2019-05-17 15:30
 */
public class StrategyFactory {

    private static StrategyFactory strategyFactory = new StrategyFactory();

    public StrategyFactory() {}

    private static Map<Integer, Strategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put(RechargeTypeEnum.E_BANK.getCode(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.getCode(), new BusiAcctStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.getCode(), new MobileStrategy());
        strategyMap.put(RechargeTypeEnum.CARD_RECHARGE.getCode(), new CardStrategy());
    }

    public Strategy creator(Integer type) {
        return strategyMap.get(type);
    }

    public static StrategyFactory getInstance() {
        return strategyFactory;
    }

}
