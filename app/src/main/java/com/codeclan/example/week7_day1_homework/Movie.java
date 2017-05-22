package com.codeclan.example.week7_day1_homework;

/**
 * Created by richardedwards on 22/05/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int rank;

    Movie(String title, String genre, int rank){
        this.title = title;
        this.genre = genre;
        this.rank = rank;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public int getRank(){
        return rank;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString(){
        return title+", ("+genre+"): Rank "+rank;
    }
}
