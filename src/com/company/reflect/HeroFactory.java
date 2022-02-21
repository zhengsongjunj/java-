package com.company.reflect;



public class HeroFactory {
    public static SkillImpl getHero (String name) throws Exception {
        SkillImpl iSkill;
        // 元类  类是对象的抽象，元类是描述一个类
        String classString = "reflect.hreo." + name;
        Class<?> cla = Class.forName(classString);
        Object obj = cla.newInstance();
        return (SkillImpl)obj;
    };
}
