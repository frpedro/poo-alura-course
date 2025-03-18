package br.com.alura.films.model;

public class Tittle {

    // attributes
    private String name;
    private int year;
    private boolean onPlan;
    private double sumReviews;
    private int totalReviews;
    private int minutesDuration;

    // get and setters
    public int getTotalReviews() {return totalReviews;}

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOnPlan(boolean setOnPlan) {
        this.onPlan = onPlan;
    }

    public void setMinutesDuration(int minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    // methods
    // show results
    public void showPrints() {
        System.out.println(name);
        System.out.println(year);
        System.out.println(onPlan);
        System.out.println(sumReviews);
        System.out.println(totalReviews);
        System.out.println(minutesDuration);
    }

    // sum of reviews
    public void note(double nota) {
        sumReviews += nota;
        totalReviews ++;
    }

    // calculate the average reviews
    public double ratingAverage() {
        return sumReviews / totalReviews;
    }
}
