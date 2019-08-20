package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main4 {
    public static void main(String[] args) {
        List<City> cities = Main3.initialize();

        reverse(cities);

        System.out.println(cities.get(1));
        System.out.println(cities.get(4));

    }

    public static List<City> reverse (List<City> list ) {
        ListIterator<City> iterator = list.listIterator(list.size());
        List<City> cities = new ArrayList<>();

        while (iterator.hasPrevious()) {
            cities.add(iterator.previous());
        }

        return cities;
    }

}
