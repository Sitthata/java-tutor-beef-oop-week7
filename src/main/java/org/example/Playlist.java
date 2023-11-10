package org.example;

import java.util.Arrays;

public class Playlist {
    static String[] playlist = new String[5];
    static int songCount = 0;

    public static void main(String[] args) {
        // 0
        addSong("SongA"); // 1
        addSong("SongB"); // 2
        addSong("SongC"); // 2
        addSong("SongD"); // 2
        showSong();
        int numberSong = findSongIndex("null");
        System.out.println(numberSong);
        updateSong("Songbbbbbbb", "SongAA");
        showSong();
    }

    public boolean compareArray(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void addSong(String songName) {
        /*
        "Die For You", "Shape of You"
`       playlist = [null, ... 4]
        addSong("Die For You")
        playlist = ["Die for you", null ... 3]
        addSong("Shape of You")
        playlist = ["Die for you", "Shape of You", null ... 2]
        */

        // We can return even when we are in void function
        if (isInvalidInput(songName)) {
            System.out.println("Song name cannot be empty");
            return;
        }
        // handle the case when playlist is full
        if (songCount == playlist.length) {
            System.out.println("Playlist is full");
            return;
        }

        playlist[songCount] = songName;
        songCount++;
    }

    public static void showSong() {
        // Write the code to print all song here...
        // We can use songCount
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i] == null) {
                break;
            }
            System.out.println(i + " - " + "[" + playlist[i] + "]");
        }
    }

    // [SongA, SongB ,Song C , , ]
    // findSongIndex(SongC) -> 2
    // findSongIndex(SongZ) -> -1

    public static int findSongIndex(String songName) {
        // Write the code to find the index of the song here
        for (int i = 0; i < songCount; i++) {
            if (playlist[i].equals(songName)) {
                return i;
            }
        }
        return -1;
    }

    // [SongA, SongB , , , ]
    // update(SongB, SongC)
    // [SongA, SongC , , , ]
    public static void updateSong(String songName, String newSongName) {
        // Write the code to update the song here...
        int index = findSongIndex(songName);
        if (index == -1) {
            System.out.println("Song not found on playlist");
            return;
        }
        playlist[index] = newSongName;
    }

    public static boolean isInvalidInput(String songName) {
        // Check for null or empty string
        return songName == null || songName.isBlank();
    }
}
