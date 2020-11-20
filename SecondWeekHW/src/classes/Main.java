package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //keyboard'un has-a ilişkisini düzgün kodladığımı düşünmüyorum.

        Apple apple = new Apple ("IPhone 4", "432432", "1", 512, 3.5, new Keyboard("touch-sensitive keyboard"));
        Samsung samsung = new Samsung ("Galaxy S3", "5435A", "0", 1536 , 4.8, new Keyboard("physical keyboard"));
        System.out.println("Apple produced");
        apple.printInfos();
        apple.call();
        apple.sendSMS();
        apple.screenSharing();
        apple.videoCalling();
        apple.getKeyboard().printKeyboard();

        System.out.println();

        System.out.println("Samsung produced");
        samsung.printInfos();
        samsung.fileSharing();
        samsung.screenSharing();
        samsung.call();
        samsung.sendSMS();
        samsung.getKeyboard().printKeyboard();

    }
}
