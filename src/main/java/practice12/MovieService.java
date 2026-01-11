package practice12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


import static java.util.stream.Collectors.toList;

public class MovieService <T extends Number> {
    private final Map<Movie, List<Rating<T>>> ratings = new HashMap<>();

    public synchronized void addRating(Movie movie, Rating<T> rating) {
        double value = rating.getValue().doubleValue();
        if (value < 1.0 || value > 10.0) {
            throw new IllegalArgumentException("Оценка должна быть в пределах от 1 до 10");
        }
        ratings.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
    }

    public double getAverageRating(Movie movie) {
        List<Rating<T>> movieRatings = ratings.get(movie);
        if (movieRatings == null || movieRatings.isEmpty()) {
            throw new IllegalArgumentException("Нет оценок для фильма");
        }
        return movieRatings.stream()
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElse(0.0);
    }

    public List<Movie> getSortedMovieByRating() {
        return ratings.entrySet().stream()
                .filter(e -> !e.getValue().isEmpty())
                .sorted((e1, e2) -> Double.compare(
                        getAverageRating(e2.getKey()),
                        getAverageRating(e1.getKey())
                ))
                .map(Map.Entry :: getKey)
                .collect(Collectors.toList());
    }



}

    

