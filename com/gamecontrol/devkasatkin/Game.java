package com.gamecontrol.devkasatkin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    private static Game instance = null;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            return new Game();
        } else {
            return instance;
        }
    }

    public void run() {

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                while (true) {
                    Menu.drawMeinMenu();
                    int choiceNumb = Integer.parseInt(reader.readLine());
                    switch (choiceNumb){
                        case (1):
                            System.out.println("The game has been started...");
                            break;
                        case (0):
                            System.exit(0);
                            break;
                        default:
                            System.out.println("You have entered the wrong number.");
                            break;
                    }
                }
            } catch(IOException e) {
                System.out.println(e.getMessage());
            }

    }
}
