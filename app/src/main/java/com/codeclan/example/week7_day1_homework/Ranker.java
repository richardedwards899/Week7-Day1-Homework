package com.codeclan.example.week7_day1_homework;

import java.lang.reflect.Array;
import java.util.LinkedList;

/**
 * Created by richardedwards on 22/05/2017.
 */

class Ranker {

    private Movie movies[];

    public Ranker() {
        movies = new Movie[10];

        movies[0] = new Movie("Superman", "Action", 0);
        movies[1] = new Movie("Batman", "Action", 1);
        movies[2] = new Movie("The Hulk", "Action", 2);
        movies[3] = new Movie("Terminator", "Action", 3);
        movies[4] = new Movie("Terminator 2", "Action", 4);
        movies[5] = new Movie("Alien", "Action", 5);
        movies[6] = new Movie("Aliens", "Action", 6);
        movies[7] = new Movie("Alien 3", "Action", 7);
        movies[8] = new Movie("One Flew Over The Cuckcoos Nest", "Action", 8);
        movies[9] = new Movie("One Flew Over The Cuckcoos Nest", "Action", 9);
    }

    public Movie getMovieByRank(int rank) {
        return movies[rank];
    }

    public void replaceFinalMovie(Movie movie) {
        movies[9] = movie;
    }
}
