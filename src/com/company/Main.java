package com.company;

import com.company.awkward.hero.Camille;
import com.company.awkward.hero.Diana;
import com.company.awkward.hero.Irelia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = getPlayerInput();
        switch (name) {
            case "Diana":
                Diana diana = new Diana();
                diana.r();
            case "Irelia":
                Irelia irelia = new Irelia();
                irelia.r();
            case "Camille":
                Camille camille = new Camille();
                camille.r();

        }
    }

    private static String getPlayerInput() {
        System.out.println("enter a hero's name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}
