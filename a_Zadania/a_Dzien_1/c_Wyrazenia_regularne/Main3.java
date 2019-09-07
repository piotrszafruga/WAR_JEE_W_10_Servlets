package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    private static final String REGEX = "(\\d+[+\\-*\\/])*\\d+=\\d+";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String line = scan.nextLine();
        try {
            while (!line.equals("quit")) {
                FileWriter fw = new FileWriter("operations.txt", true);
                line = line.replaceAll("\\s+", "");
                if (line.matches(REGEX)) {
                    fw.append(line + System.lineSeparator());
                    fw.close();
                }
            }
        } catch(IOException e) {
            System.out.println("Błąd pliku");
        }
    }
}
