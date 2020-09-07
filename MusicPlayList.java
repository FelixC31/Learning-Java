package com.jetBrains;


import java.util.*;

public class MusicPlayList {


    static List<Song> listOfSongs = new ArrayList<>();
    static List<Song> playedSongs = new ArrayList<>();
    static Map<Song, Integer> playedSongsLogs = new HashMap<>();
    static Set<String> playList = new HashSet<String>();

    public static void main(String[] args) {

        //songs to play
        listOfSongs.add(new Song("song1", 3, false));
        listOfSongs.add(new Song("song2", 3, false));
        listOfSongs.add(new Song("song3", 2, false));
        listOfSongs.add(new Song("song4", 2, false));
        listOfSongs.add(new Song("song5", 2, false));
        listOfSongs.add(new Song("song6", 3, false));
        listOfSongs.add(new Song("song7", 2, false));
        listOfSongs.add(new Song("song8", 1, false));
        listOfSongs.add(new Song("song9", 4, false));
        listOfSongs.add(new Song("song10", 4, false));
        System.out.println("Songs to play: ");
        for (Song song:listOfSongs
             ) {
            var names = song.getName();
            System.out.println(names);
        }


        System.out.println("------------------------");

        // songs played
        playedSongs.add(listOfSongs.get(1));
        playedSongs.add(listOfSongs.get(3));
        playedSongs.add(listOfSongs.get(3));
        playedSongs.add(listOfSongs.get(6));
        playedSongs.add(listOfSongs.get(1));
        playedSongs.add(listOfSongs.get(8));
        System.out.println("Played songs: ");
        for (Song song:playedSongs
             )
           song.setFlag(true);
        for (Song x : playedSongs) {
            playList.add(x.getDetails());
        }
        Iterator iter = playList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }



        // how many time a song was played
        System.out.println("-------------------");
        System.out.println("How many times: ");
        countFrequencies(playedSongs);



    }

    public static void countFrequencies(List<Song> playedSongs)
    {


        for (Song song : playedSongs) {
            Integer reapet = playedSongsLogs.get(song);
            System.out.println(playedSongsLogs);
            playedSongsLogs.put(song, (reapet == null) ? 1 : reapet + 1);
        }



        for (Map.Entry<Song, Integer> val : playedSongsLogs.entrySet()) {
            System.out.println("The song " + val.getKey().getName() +
                     " was played "
                    +  val.getValue() + " times");
        }
    }
}



