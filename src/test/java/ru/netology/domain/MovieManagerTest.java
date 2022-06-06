package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest { 

    @Test
    public void shouldAddMovies () {
        MovieManager manager = new MovieManager();
        int movieAmount = 3;
        Movie [] movies = new Movie[movieAmount];
        for (int i = 0; i < movieAmount; i++) {
            Movie newMovie = new Movie();
            manager.add(newMovie);
            movies[i] = newMovie;
        }
        Movie [] actual = manager.findAll();
        Movie [] expected = movies;

        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldFindLast1 () {
        MovieManager manager = new MovieManager();
        int movieAmount = 14;
        Movie [] movies = new Movie[movieAmount];
        for (int i = 0; i < movieAmount; i++) {
            Movie newMovie = new Movie();
            manager.add(newMovie);
            movies[i] = newMovie;
        }
        Movie [] actual = manager.findLast();
        Movie [] expected = {movies[13],movies[12],movies[11],movies[10],movies[9],movies[8],movies[7],movies[6],movies[5],movies[4]};
    }

    @Test
    public void shouldFindLast2 () {
        MovieManager manager = new MovieManager(4);
        int movieAmount = 7;
        Movie [] movies = new Movie[movieAmount];
        for (int i = 0; i < movieAmount; i++) {
            Movie newMovie = new Movie();
            manager.add(newMovie);
            movies[i] = newMovie;
        }
        Movie [] actual = manager.findLast();
        Movie [] expected = {movies[6],movies[5],movies[4],movies[3]};
    }
}
