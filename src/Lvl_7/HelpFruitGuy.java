package Lvl_7;

import java.util.ArrayList;
import java.util.Arrays;

public class HelpFruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {

        if (fruitBasket == null || fruitBasket.length <= 0) return new String[]{};

        for (int i = 0; i < fruitBasket.length; i++)
            fruitBasket[i] = fruitBasket[i].replaceAll("rotten", "").toLowerCase();

        return fruitBasket;
    }
}
