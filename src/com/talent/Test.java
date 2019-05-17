package com.talent;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 测试类
 * @create: 2019-05-10 17:38
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        String[] strs = new String[list.size()];

        System.out.println(list.toArray(strs).length);
    }
}
