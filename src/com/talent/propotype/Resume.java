package com.talent.propotype;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design_patterns
 * @author: Mr.Guo
 * @description: 原型类
 * @create: 2019-05-09 10:47
 */
public class Resume implements Cloneable {

    private String name;

    private List<String> list;

    private PersonalInfo personalInfo;

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();

        List<String> strs = new ArrayList<>();
        if (list != null) {
            for (String str : list) {
                strs.add(str);
            }
        }
        resume.setList(strs);

        if (this.personalInfo != null) {
            this.personalInfo = personalInfo.clone();
            resume.setPersonalInfo(personalInfo);
        }
        return resume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", list=" + list +
                ", personalInfo=" + personalInfo +
                '}';
    }
}
