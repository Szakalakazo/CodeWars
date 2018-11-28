import Lvl_7.Mumbling;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 6, 2, 1, 8, 10 };
        String[] stringArray = { "ala" , "ma", "kota" };

        //Removing Spaces in String
        //System.out.println(RemoveStringSpaces.noSpace("String With Spaces"));

        //Counting Sheeps
        /*Boolean[] aWeirdArray = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
        System.out.println(CountingSheeps.countSheeps(aWeirdArray));
        */

        //BasicMathOperators
        //System.out.println(BasicMathOperations.basicMath("/",10,5));

        //SumWithout Highest and Lowest
        //System.out.println(SumWithoutHighestLlowest.sum(array));

        //Convert number to reversed array of digits
        //System.out.println(Arrays.toString(ConvertNumberToReversedArrayDigits.digitize(-123)));

        //Mumbling
        System.out.println(Mumbling.accum("jakao"));
    }
}
