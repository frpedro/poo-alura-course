package br.com.alura.films.model;

import br.com.alura.films.calculate.Classification;

public class Episode implements Classification {

    // attributes
    private int number;
    private String name;
    private String serie;
    private int totalViews;

    // get and setters
    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    // override method, compares total views and rank
    @Override
    public int getClassification() {
        if (totalViews > 100) {

            return 4;
        }
        else {
            return 2;
        }

    }
}
