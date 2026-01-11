package practice12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    @Test
    void testAverageRating() {
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("In Time");

        service.addRating(movie, new Rating<>(8));
        service.addRating(movie, new Rating<>(10));
        assertEquals(9.0, service.getAverageRating(movie));

    }

    @Test
    void testInvalidRating() {
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Wrong Movie");
        assertThrows(IllegalArgumentException.class, () ->
            service.addRating(movie, new Rating<>(13)));
    }

    @Test
    void testSortedMoviesByRating() {
        MovieService<Double> service = new MovieService<>();
        Movie m1 = new Movie("Movie A");
        Movie m2 = new Movie("Movie B");

        service.addRating(m1, new Rating<>(5.0));
        service.addRating(m2, new Rating<>(7.0));

        List<Movie> sorted = service.getSortedMovieByRating();
        assertEquals(m2, sorted.get(0));
        assertEquals(m1, sorted.get(1));
    }

    @Test
    void testAverageWithoutRatings() {
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Empty");
        assertThrows(IllegalArgumentException.class, () -> service.getAverageRating(movie));
    }
}
