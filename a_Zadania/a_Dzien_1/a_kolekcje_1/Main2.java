package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();

        for (int i = 10; i < 20 ; i++) {
            elements.add(i);
        }
        removeDivider(elements, 3);

        for (Integer i : elements){
            System.out.println(i);
        }
    }

    public static void removeDivider(List<Integer> list, int divider) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % divider == 0) {
                iterator.remove();
            }
        }
    }
}
