package com.talent.propotype;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 原型模式测试类
 * @create: 2019-05-09 10:46
 */
public class PropotypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume();
        resume.setName("对象");

        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.setAge("18");
        personalInfo.setSex("女");
        resume.setPersonalInfo(personalInfo);

        Resume resume1 = resume.clone();
        System.out.println(resume1.getName());
        System.out.println(resume1.getPersonalInfo());
    }
}
