package com.gamecontrol.devkasatkin;

public class Background {
    private String text;

    public Background(String text) {
        this.text = text;
    }

    public void showTextAnimation() throws InterruptedException {
        if (this.text != null) {
            String[] lines = text.split("\\n");
            for (String line : lines) {
                System.out.println(line);
                Thread.sleep(2000);
            }
        }
    }
}
