package session11W3resourceOOP;

public class Movie {
    private String title;
    private String director;
    private String[] actors;
    private String[] reviews;
    private int countOfReview;
    private int countOfActor;

    public Movie( String title, String director,int maxCountOfActor, int maxCountOfReview) {
        this.director = director;
        this.title = title;
        this.actors = new String[maxCountOfActor];
        this.reviews = new String[maxCountOfReview];
        this.countOfActor = 0;
        this.countOfReview = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActors() {
        return actors;
    }

    public String[] getReviews() {
        return reviews;
    }

    public void addActor(String actor) {
        if (countOfActor < actors.length) {
            actors[countOfActor] = actor;
            countOfActor++;
        } else {
            System.out.println("there is not enough place");
        }
    }

    public void addReview(String review) {
        if (countOfReview < reviews.length) {
            reviews[countOfReview] = review;
            countOfReview++;
        } else {
            System.out.println("There is not enough place ");
        }
    }

    public void showMovieDetail() {
        System.out.println("title : " + title);
        System.out.println("director : " + director);
        System.out.print("actors : ");
        for (int i = 0; i < countOfActor; i++) {
            System.out.print(actors[i]);
            if (i < countOfActor - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("reviews :");
        for (int i = 0; i < countOfReview; i++) {
            System.out.println("- " + reviews[i]);
        }
    }
}
