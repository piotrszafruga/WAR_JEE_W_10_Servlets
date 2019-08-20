package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<City> cities = initialize();

        List<City> sub1 = firstSubList(cities,2,4);

        System.out.println(sub1.size());

    }

    public static List<City> initialize() {
        List<City> cities = new ArrayList<>();

        City c1 = new City("Berlin",4000000);
        City c2 = new City("Paris",6000000);
        City c3 = new City("Lubliana",700000);
        City c4 = new City("Wien",2000000);
        City c5 = new City("Koln",1500000);

        cities.add(c1);
        cities.add(c2);
        cities.add(c3);
        cities.add(c4);
        cities.add(c5);

        return cities;
    }

    public static List<City> firstSubList(List<City> list, int start, int end ) {
        List<City> sublist = new ArrayList<>();

        for (int i = start; i<=end; i++) {
            sublist.add(list.get(i));
        }
        return sublist;
    }

    public static List<City> secondSubList(List<City> list, int start, int end ) {
        return list.subList(start,end+1);
    }


}


