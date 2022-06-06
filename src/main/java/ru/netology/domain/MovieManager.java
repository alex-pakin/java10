package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MovieManager {
    private Movie[] movies = new Movie[0];

    private int showLastMovies;

    public MovieManager() {
        this.showLastMovies = 10;
    }
    public MovieManager(int showLastMovies) {
        this.showLastMovies = showLastMovies;
    }


    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie [] tmp = new Movie[length];
        System.arraycopy(movies,0,tmp,0,movies.length);
        int newMovie = tmp.length - 1;
        tmp[newMovie] = movie;
        movies = tmp;
    }

    public Movie[] findAll () {
        return movies;
    }

    public Movie[] findLast () {
        Movie[] result = new Movie[showLastMovies];
        if (showLastMovies < movies.length) {
            for (int i = 0; i < showLastMovies; i++) {
                int index = movies.length -i - 1;
                result[i] = movies[index];
            }
        } else {
            for (int i = 0; i < showLastMovies; i++) {
                int index = movies.length -i - 1;
                result[i] = movies[index];
            }
        }
        return result;
    }





}
