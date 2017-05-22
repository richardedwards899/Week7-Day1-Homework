package com.codeclan.example.week7_day1_homework;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by richardedwards on 22/05/2017.
 */

public class RankerTest {

    @Test
    public void canCreateMovieRanker(){
        Ranker ranker = new Ranker();
        Movie movie = new Movie("Superman", "Action", 0);

        assertEquals(movie.toString(), ranker.getMovieByRank(0).toString());
    }

    @Test
    public void canReplaceFinalMovie(){
        Ranker ranker = new Ranker();
        Movie movie = new Movie("Dracula", "Horror", 9);

        ranker.replaceFinalMovie(movie);
        assertEquals(movie.toString(), ranker.getMovieByRank(9).toString());
    }
}
