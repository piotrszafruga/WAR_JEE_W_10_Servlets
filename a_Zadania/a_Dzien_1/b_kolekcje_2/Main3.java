package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        List<Country> countries = initialize();
        Map countriesMap = getMap(countries);
        Iterator<Map.Entry<String, Country>> iterator = countriesMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Country> kV = iterator.next();
            System.out.println(kV.getKey() + " - " + kV.getValue().getName());
        }

    }

    public static List<Country> initialize () {
        List<Country> countries = new ArrayList<>();
        Country c1 = new Country("Maroco", "Rabat");
        Country c2 = new Country("Portugal", "Lisbon");
        Country c3 = new Country("Iran", "Teheran");
        Country c4 = new Country("Finland", "Helsinki");
        Country c5 = new Country("Vietnam", "Hanoi");

        countries.add(c1);
        countries.add(c2);
        countries.add(c3);
        countries.add(c4);
        countries.add(c5);

        return countries;

    }

    public static Map<String, Country> getMap (List<Country> list) {
        Map<String, Country> countries = new HashMap<>();

        for (Country c : list) {
            countries.put(c.getCapital(), c);
        }

        return countries;
    }

}
