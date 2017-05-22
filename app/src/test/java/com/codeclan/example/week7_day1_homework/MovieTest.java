package com.codeclan.example.week7_day1_homework;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by richardedwards on 22/05/2017.
 */

public class MovieTest {

    @Test
    public void canCreateMovie(){

        Movie movie = new Movie("Terminator", "Action", 0);

        assertEquals("Terminator", movie.getTitle());
        assertEquals("Action", movie.getGenre());
        assertEquals(0, movie.getRank());
    }

    @Test
    public void canSetTitle(){
        Movie movie = new Movie("Terminator", "Action", 0);

        movie.setTitle("Labyrinth");
        assertEquals("Labyrinth", movie.getTitle());
    }

    @Test
    public void canSetGenre(){
        Movie movie = new Movie("Terminator", "Action", 0);

        movie.setGenre("Thriller");
        assertEquals("Thriller", movie.getGenre());
    }

    @Test
    public void canSetRank(){
        Movie movie = new Movie("Terminator", "Action", 0);

        movie.setRank(9);
        assertEquals(9, movie.getRank());
    }

    @Test
    public void canOverrideToString(){
        Movie movie = new Movie("Terminator", "Action", 0);
        assertEquals("Terminator, (Action): Rank 0", movie.toString());
    }
}
