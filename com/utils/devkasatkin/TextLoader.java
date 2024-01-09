package com.utils.devkasatkin;

import java.io.BufferedReader;
import java.io.FileReader;

public class TextLoader {

    public static String getTextFromFile(String fileName) {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader)
        ){
            String line;
            StringBuilder textFromFile = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                textFromFile.append(line);
                textFromFile.append("\n");
            }
            return textFromFile.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
