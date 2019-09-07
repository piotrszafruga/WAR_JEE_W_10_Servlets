package b_Zadania_Domowe.a_Dzien_1;

import pl.coderslab.collection.GenerateRandom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.LineNumberInputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

    public static void main(String[] args) {
        System.out.println(GenerateRandom.checkRand(10,10));
        employees();
    }

    public static void employees() {
        Map<Double,List<String>> mapAmounts = new HashMap<>();

        File file = new File("earnings.txt");
        String regex = "\\.*(\\d|\\.)+(?=(\\s)*zł)";

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                if (!(str.contains("Kowalski") || str.contains("Kowalska"))) {
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.find()) {
                        Double sum = Double.parseDouble(matcher.group());
                        if (mapAmounts.get(sum) == null) {
                            List<String> strList = new ArrayList<>();
                            strList.add(str);
                            mapAmounts.put(sum, strList);
                        } else {
                            mapAmounts.get(sum).add(str);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }


        List<Double> list = new ArrayList<>(mapAmounts.keySet());
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < Integer.min(3, mapAmounts.size()); i++) {
            System.out.println(mapAmounts.get(list.get(i)));
        }
    }

}
