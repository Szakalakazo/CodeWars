package Lvl_6;

public class Dubstep {
    public static String SongDecoder (String song){

        return  song.replaceAll("(WUB)+", " ");
        //return song.replaceAll("WUB"," ").replaceAll(" {2,}"," ").trim();



    }
}
