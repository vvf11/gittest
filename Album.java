package com.company;
import java.util.ArrayList;

public class Album {
    private String Autor;
    private String Janr;
    private Integer Year;
    private Integer DurationAlbum;
    private final ArrayList<Music> Musics = new ArrayList<Music>();

    public void addMusic(Music newMusic)
    {
       Musics.add(newMusic);
    }

    public void removeMusic(Music remMusic)
    {
        Musics.remove(remMusic);
    }

    public ArrayList<Music> getMusics()
    {
        return Musics;
    }


    public String GetAutor()
    {
        return Autor;
    }

    public void SetAutor(String newAutor)
    {
        Autor = newAutor;
    }

    public String GetJanr()
    {
        return Janr;
    }
    public void SetJanr(String newJanr)
    {
        Janr = newJanr;
    }

    public int GetYear()
    {
        return Year;
    }
    public void SetYear(int newYear)
    {
        Year = newYear;
    }

    private Collection collection;
    public Collection GetCollection()
    {
        return collection;
    }

    public void SetCollection(Collection collection)
    {
        this.collection = collection;
    }

    private int totalArea = 0;
      public Integer  getDuration_of_sound()
        {
            for (Music elem : Musics)
            totalArea += elem.GetDurationMusic();
            return totalArea;
        }
}
