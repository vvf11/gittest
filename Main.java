package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Collection collection = new Collection();
        Album Cream_Soda = new Album();
        Album Intergalactic = new Album();
        Music Cometa2 = new Music();
        Music Nikakih_ve4erinok = new Music();
        Music TTT = new Music();

        collection.SetNameCollection("Комета");
        collection.SetFIO("Васильев Василий Васильевич");

        Cream_Soda.SetAutor("Cream Soda");
        Cream_Soda.SetJanr("Хаусовый электропоп");
        Cream_Soda.SetYear(2019);
        collection.AddAlbum(Cream_Soda);

        Intergalactic.SetAutor("Intergalactic");
        Intergalactic.SetJanr("Хаусовый электропоп");
        Intergalactic.SetYear(2020);
        collection.AddAlbum(Intergalactic);

        Cometa2.SetNameMusic("Комета");
        Cometa2.SetDurationMusic(3 * 60 + 48);
        Cream_Soda.addMusic(Cometa2);
        Cometa2.SetAlbum(Cream_Soda);

        Nikakih_ve4erinok.SetNameMusic("Никаких больше вечеринок");
        Nikakih_ve4erinok.SetDurationMusic(3 * 60 + 46);
        Cream_Soda.addMusic(Nikakih_ve4erinok);
        Nikakih_ve4erinok.SetAlbum(Cream_Soda);

        TTT.SetNameMusic("ТТТ");
        TTT.SetDurationMusic(4 * 60 + 14);
        Intergalactic.addMusic(TTT);
        TTT.SetAlbum(Intergalactic);


/*
        System.out.println("Задание 1:");
        System.out.println("Название коллекции:"+collection.GetNameCollection());
        System.out.println("ФИО автора:"+collection.GetFIO());
        System.out.println('\n');
        System.out.println("Музыкальный носитель:");
        System.out.println("_________________________________________");
        System.out.println("Группа: " + Cream_Soda.GetAutor());
        System.out.println("Жанр: " +Cream_Soda.GetJanr());
        System.out.println("Год выпуска - " + Cream_Soda.GetYear());
        System.out.println("Общая продолжительность звучания - "+(Cream_Soda.getDuration_of_sound() / 60) + " минут(ы) " + Cream_Soda.getDuration_of_sound()/2 % 60 + " секунд(ы)");
        System.out.println("Треки музыкального носителя:");
        System.out.println("_________________________________________");
        System.out.println("Название трека: " + Cometa2.GetNameMusic());
        System.out.println("Продолжительность: " + (Cometa2.GetDurationMusic() / 60) + " минут(ы) " + Cometa2.GetDurationMusic() % 60 + " секунд(ы)");
        System.out.println("Название трека: " + Nikakih_ve4erinok.GetNameMusic());
        System.out.println("Продолжительность: " + (Nikakih_ve4erinok.GetDurationMusic() / 60) + " минут(ы) " + Nikakih_ve4erinok.GetDurationMusic() % 60 + " секунд(ы)");
        System.out.println('\n');
        System.out.println("Музыкальный носитель:");
        System.out.println("_________________________________________");
        System.out.println("Группа: " + Intergalactic.GetAutor());
        System.out.println("Жанр: " +Intergalactic.GetJanr());
        System.out.println("Год выпуска - " + Intergalactic.GetYear());
        System.out.println("Общая продолжительность звучания - "+(Intergalactic.getDuration_of_sound() / 60) + " минут(ы) " + Intergalactic.getDuration_of_sound()/2 % 60 + " секунд(ы)");

        System.out.println("Треки музыкального носителя:");
        System.out.println("_________________________________________"); System.out.println("Название трека: " + TTT.GetNameMusic());
        System.out.println("Продолжительность: " + (TTT.GetDurationMusic() / 60) + " минут(ы) " + TTT.GetDurationMusic() % 60 + " секунд(ы)");
*/
        System.out.println('\n');
        System.out.println("Задание 2:");
        for (Music albumm : Cream_Soda.getMusics()) {
            System.out.println("Название музыкального произведения: " + albumm.GetNameMusic() + "\n" +"Продолжительность музыкального произведения: "+ albumm.GetDurationMusic()/60+  " минут(ы) " +albumm.GetDurationMusic()%60+ " секунд(ы)");

        };

        System.out.println("Общая продолжительность всех музыкальных произведения альбома: "+Cream_Soda.getDuration_of_sound()/60 + " минут(ы) "+ Cream_Soda.getDuration_of_sound()/2%60 + " секунд(ы)");

        System.out.println('\n');
        System.out.println("Задание 3:");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название произведения:");
        String UserAdress = in.nextLine();
        Music userMusical_Composition = collection.searchMusic(UserAdress);
        String soughtName = userMusical_Composition.GetNameMusic();
        if (soughtName != null)
        {
            System.out.println("Продолжительность музыкального произведения: " + (userMusical_Composition.GetDurationMusic() / 60) + " минут(ы) " + userMusical_Composition.GetDurationMusic() % 60 + " секунд(ы)");
            System.out.println("Название альбома:"+userMusical_Composition.GetAlbum().GetAutor());
        }
        else
            System.out.println("Произведение не найдено");
    }
}
