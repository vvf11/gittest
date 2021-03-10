package com.company;

public class Music {
    private String NameMusic;
    private Integer DurationMusic;
    private Album albumm;

    public void SetAlbum(Album albumss)
    {
        this.albumm = albumss;
    }
    public Album GetAlbum()
    {
        return albumm;
    }

    public String GetNameMusic()
    {
        return NameMusic;
    }
    public void SetNameMusic(String newNameMusic)
    {
        NameMusic = newNameMusic;
    }

    public int GetDurationMusic()
    {
        return DurationMusic;
    }
    public void SetDurationMusic(int newDurationMusic)
    {
        DurationMusic = newDurationMusic;
    }


}
