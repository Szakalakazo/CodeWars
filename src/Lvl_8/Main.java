package Lvl_8;

public class Main {
    public static void main(String[] args) {
        //Removing Spaces in String
        //System.out.println(RemoveStringSpaces.noSpace("String With Spaces"));

        //Counting Sheeps

        Boolean[] aWeirdArray = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};

        System.out.println(CountingSheeps.countSheeps(aWeirdArray));
    }
}
