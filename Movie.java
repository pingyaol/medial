public class Movie {
  private String title;
  private double duration;
  private int rating;
  
  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", with a duration of " + duration + " minutes";
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  public boolean equals(Movie m) {
    boolean sameMovie = this.title.equals(m.getTitle()) && this.duration == m.getDuration(); 
    return sameMovie; 
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }

  public int adjustRating(int r) {
    if (r >= 0 && r <= 10) {
      rating += r; 
    } else {
      rating = 10; 
    }
    return rating; 
  }
}
