package com.company.factory;

import com.company.factory.hero.Camille;
import com.company.factory.hero.Diana;
import com.company.factory.hero.Irelia;

public class HeroFactory {
    public static SkillImpl getHero (String name) throws Exception {
        SkillImpl iSkill;
        switch (name){
            case "Diana":
                iSkill = new Diana();
                break;
            case "Irelia":
                iSkill = new Irelia();
                break;
            case "Camille":
                iSkill = new Camille();
                break;
            default:
                throw new Exception();
        }
        return iSkill;
    };
}
