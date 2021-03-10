package com.company;
import java.util.ArrayList;

public class Collection {
    private String NameCollection;
    private String FIO;
    private final ArrayList<Album> Albums = new ArrayList<>();

    public String GetNameCollection()
    {
        return NameCollection;
    }
    public void SetNameCollection(String newNameCollection)
    {
        NameCollection = newNameCollection;
    }

    public String GetFIO()
    {
        return FIO;
    }
    public void SetFIO(String newFIO)
    {
        FIO = newFIO;
    }


    public Music searchMusic(String nameMusic)
    {
        Music soughtMusic = new Music();
        boolean found = false;

        for (var item : Albums)
        {
            for (var item2 : item.getMusics())
            {
                if (item2.GetNameMusic().equals(nameMusic))
                {
                    soughtMusic = item2;
                    found = true;
                    break;
                }
            }
            if (found)
            {
                break;
            }
        }
        return soughtMusic;
    }


    public void AddAlbum(Album newAlbum)
    {
        Albums.add(newAlbum);
    }

    public void RemoveAlbum(Album removeAlbum)
    {
        Albums.remove(removeAlbum);
    }
}
