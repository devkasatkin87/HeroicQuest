package com.gamecontrol.devkasatkin;

import com.utils.devkasatkin.TextLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    private static Game instance = null;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
            return instance;
    }

    public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                while (true) {
                    Menu.drawMainMenu();
                    int choiceNumb = Integer.parseInt(reader.readLine());
                    switch (choiceNumb){
                        case (1):
                            System.out.println("Hello!");
                            break;
                        case (2):
                            Background bg = new Background(TextLoader.getTextFromFile("Texts/Start_part1.txt"));
                            bg.showTextAnimation();
                            break;
                        case (0):
                            System.exit(0);
                            break;
                        default:
                            System.out.println("You have entered the wrong number.");
                            break;
                    }
                }
            } catch(IOException | InterruptedException e) {
                System.out.println(e.getMessage());
            }

    }
}
