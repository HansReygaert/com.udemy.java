package com.udemy.section8.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Playlist {
    private List<Song> playlist;
    private ListIterator<Song> track;
    private int index = 0;
    private boolean shuffle;

    public Playlist(List<Song> playlist) {
        playlist = new LinkedList<Song>();
        this.playlist = playlist;
        track = playlist.listIterator();
    }
    public void addSong(Song song)
    {
        playlist.add(song);

    }
    public void next()
    {
        track.next();
        
    }
    public void previous()
    {
        track.previous();
    }
    public void play()
    {
        while(track.hasNext())
        {
            track.next();
        }

    }
    public void pause()
    {

    }
    public void stop()
    {

    }
    public void repeat()
    {

    }
    public void repeatAll()
    {

    }
    public void shuffle()
    {
        shuffle = !shuffle;
    }
}
