package com.aberneko.learning.Object.Equals.RuleContract;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)
    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if (object == null) return false;
        if (this.getClass() != object.getClass()) return false;
        Song son = (Song) object;
        return Objects.equals(title, son.title) &&
                Objects.equals(artist, son.artist) &&
                Objects.equals(songwriter, son.songwriter);
    }

}