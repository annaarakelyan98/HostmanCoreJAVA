package org.javacore.chapter_3.point_7_I_O;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class FileInputAndOutputDemo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Path.of(""), StandardCharsets.UTF_8);
            String name = scanner.nextLine();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
