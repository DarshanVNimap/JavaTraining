package org.DarshanValaJavaTraining;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


enum Category {
    ACTION, COMEDY,THILLER
}
class Movie{
    String name;
    double rating ;

    Category category;

    public Movie(String name, double rating, Category category) {
        this.name = name;
        this.rating = rating;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Movie> movieList = Arrays.asList(
                new Movie("Jawan" , 8.7, Category.ACTION),
                new Movie("Game of throns" , 7,Category.THILLER),
                new Movie("Pathan" , 5 , Category.ACTION),
                new Movie("Bahubali" , 8.7, Category.COMEDY)
        );

//Demo of sort ,peek ,filter and limit
        Stream<Movie> movieStream = movieList.stream();
        movieStream
                .sorted(Comparator.comparing(Movie::getRating))
                .peek(movie -> System.out.println("peek: "+ movie.getName()))
                .filter(movie -> (movie.getName().length() > 5))
                .limit(1)
        .forEach(System.out::println);

//Demo map, unique value and reduce
        double total_rate = movieList.stream()
                .map(Movie::getRating)
                .distinct()
                .reduce(0.0, (c, e)->(c+e));
        System.out.println(total_rate);

        // Grouping
        movieList.stream()
                .collect(Collectors.groupingBy(Movie::getCategory))
                .forEach((c , m)-> System.out.println(c + " : " +m) );


        // Partationing

        movieList.stream()
                .collect(Collectors.partitioningBy(m-> m.getRating() > 5))
                .forEach((r , movie)->System.out.println(r+"  : "+movie));
    }
}
