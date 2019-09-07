package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {

    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        Random rand = new Random();
        Map<Integer, Integer> amounts = new HashMap<>();

        for (int i = 0; i < interval; i++) {
            amounts.put(i, 0);
        }

        for (int i = 0; i < amount; i++) {
            Integer num = rand.nextInt(interval);
            Integer count = amounts.get(num) + 1;
            amounts.put(num, count);
        }

        return amounts;
    }


}
