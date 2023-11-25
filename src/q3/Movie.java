package q3;

/**
 * The class Movie is started below. An instance of class Movie represents a film. This
 * class
 * has the following three class variables:
 * ● title, which is a String representing the title of the movie
 * ● studio, which is a String representing the studio that made the movie
 * ● rating, which is a String representing the rating of the movie (i.e. PG13,
 * R, etc)
 * public class Movie {
 * private String title;
 * private String studio;
 * private String rating;
 * // your code goes here
 * }
 * a) Write a constructor for the class Movie, which takes a String representing the title
 * of the movie, a String representing the studio, and a String representing the rating
 * as its
 * arguments, and sets the respective class variables to these values.
 * b) Write a second constructor for the class Movie, which takes a String representing
 * the title
 * of the movie and a String representing the studio as its arguments, and sets the
 * respective class variables to these values, while the class variable rating is set to
 * "PG".
 * c) Write a method getPG, which takes an array of base type Movie as its argument,
 * and
 * returns a new array of only those movies in the input array with a rating of "PG". You
 * may
 * assume the input array is full of Movie instances. The returned array need not be full.
 * d) Write a piece of code that creates an instance of the class Movie with the title
 * “Casino
 * Royale”, the studio “Eon Productions”, and the rating “PG13”.
 */
public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movies) {
        // Count PG Movies
        int countPG = 0;
        for (Movie movie : movies) {
            if ("PG".equalsIgnoreCase(movie.rating)) countPG++;
        }

        // Create Array Of PG Movies
        // Note: Used modern for-loop syntax to avoid confusion between old and new movies array
        Movie[] pgMovies = new Movie[countPG];
        int index = 0;
        for (Movie movie : movies) {
            if ("PG".equalsIgnoreCase(movie.rating)) {
                pgMovies[index] = movie;
                index++;
            }
        }

        return pgMovies;
    }

    // Optional Getters
    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }
}
