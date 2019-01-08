package Lvl_7;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {

        return dna.replaceAll("T","a")
                    .replaceAll("A","t")
                    .replaceAll("C","g")
                    .replaceAll("G","c")
                    .toUpperCase();


    }
}
