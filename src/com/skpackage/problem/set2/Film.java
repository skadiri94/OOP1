package com.skpackage.problem.set2;

public class Film {

    private String title;
    private String director;
    private int duration;
    private static int filmCount = 0;

    public Film(){
        this("Unknown Title","Unknown Director",0);
    }



    public Film(String title, String director, int duration){

        setTitle(title);
        setDirector(director);
        setDuration(duration);
        filmCount++;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public static int getFilmCount() {
        return filmCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String toString() {
        return "Film: " + title + "\n" +
                "Director: " + director + "\n" +
                "Duratio: " + duration ;
    }
}
