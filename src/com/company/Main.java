package com.company;

//import com.company.abstraction.SkillImpl;
//import com.company.abstraction.hero.Camille;
//import com.company.abstraction.hero.Diana;
//import com.company.abstraction.hero.Irelia;
import com.company.factory.HeroFactory;
import com.company.factory.SkillImpl;
//import com.company.awkward.hero.Camille;
//import com.company.awkward.hero.Irelia;

import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        String name = getPlayerInput();
//        switch (name) {
//            case "Diana":
//                Diana diana = new Diana();
//                diana.r();
//            case "Irelia":
//                Irelia irelia = new Irelia();
//                irelia.r();
//            case "Camille":
//                Camille camille = new Camille();
//                camille.r();
//        }
//    }

//    public static void main(String[] args) throws Exception {
//        String name = getPlayerInput();
//        SkillImpl iSkill;
//        switch (name){
//            case "Diana":
//                iSkill = new Diana();
//                break;
//            case "Irelia":
//                iSkill = new Irelia();
//                break;
//            case "Camille":
//                iSkill = new Camille();
//                break;
//            default:
//                throw new Exception();
//        }
//        iSkill.r();
//    }
    public static void main(String[] args) throws Exception {
        String name = getPlayerInput();
        SkillImpl skillImpl = HeroFactory.getHero(name);
        skillImpl.r();
    }
    private static String getPlayerInput() {
        System.out.println("enter a hero's name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}
