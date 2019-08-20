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

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Podaj tekst:");
            String line = scan.nextLine();
            if (line.equals("quit")) {
                break;
            } else {
                String shortStr = replaceAll(line);
                String path = "a_Zadania/a_Dzien_1/c_Wyrazenia_regularne/operations.txt";
                System.out.println("sdf");
                if (checkEquation(shortStr)) {
//                        try {
//                            Files.write(Paths.get(path), shortStr.getBytes());
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
                    try {
                        FileWriter fw = new FileWriter(path, true);
                        fw.append(shortStr + System.lineSeparator());
                        fw.close();
                    } catch (IOException e) {
                        System.out.println("Blad pliku");
                    }
                }
            }
        }


    }

    public static String replaceAll(String str) {
        return str.replace(" ", "");
    }

    public static boolean checkEquation(String str) {
        String regex = "(\\d+[+\\-*\\/])*\\d+=\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

}
