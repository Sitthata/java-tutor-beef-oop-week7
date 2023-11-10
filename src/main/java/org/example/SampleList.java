package org.example;

import java.util.ArrayList;
import java.util.List;

public class SampleList {
    static List<String> playlist = new ArrayList<>();
    public static void main(String[] args) {
        addSong("SongA");
        addSong("SongB");
        addSong("SongC");
        addSong("SongD");
        showSong();
    }

    public static void addSong(String songName) {
        System.out.println(songName + " is added to the playlist");
        playlist.add(songName);
    }

    public static void removeSong(String songName) {
        // Remove by object
        playlist.remove(songName);
    }

    public static void removeSongByIndex(int songIndex) {
        // Remove by index
        playlist.remove(songIndex);
    }

    public static void showSong() {
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(i + " - " + playlist.get(i));
        }
    }

    public static int findSongIndex(String songName) {
        return playlist.indexOf(songName);
    }

    public static void updateSong(String songName, String newSongName) {
        int index = findSongIndex(songName);
        if (index == -1) {
            System.out.println("Song not found");
            return;
        }
        playlist.set(index, newSongName);
        System.out.println(songName + " is updated to " + newSongName);
    }
}
