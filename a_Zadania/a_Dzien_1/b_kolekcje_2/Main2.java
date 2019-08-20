package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = 0;

        for (Map.Entry<String, String> entry : getMap().entrySet()) {
            System.out.println(entry.getKey());
            if (scan.hasNextLine()) {
                if (scan.nextLine().equals(entry.getValue())) {
                    count ++;
                }
            }
        }

        System.out.println(count);

    }

    public static Map<String, String> getMap() {
        Map<String, String> antonims = new HashMap<>();

        antonims.put("zimny", "cieply");
        antonims.put("jasny", "ciemny");
        antonims.put("biały", "czarny");
        antonims.put("duży", "mały");
        antonims.put("wąski", "szeroki");

        return antonims;
    }
}
