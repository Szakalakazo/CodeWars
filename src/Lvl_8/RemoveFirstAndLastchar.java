package Lvl_8;

public class RemoveFirstAndLastchar {
    public static void main(String[] args) {
        System.out.println(remove("eloquent"));

    }

    public static String remove(String string){
        return string.substring(1, string.length()-1);
    }
}
