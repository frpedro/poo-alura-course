package br.com.alura.films.model;

import br.com.alura.films.calculate.Classification;

public class Movie extends Tittle implements Classification {

    // constructor
    public Movie(String name, int year) {super(name, year);}

    // attributes
    private String diretor;

    // get and setters
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
    // polymorphism
    // override method to calculate classification based on average
    @Override
    public int getClassification() {
        return (int) ratingAverage() / 2;
    }

    // override toString to show movie infos
    @Override
    public String toString() {
        return "Filme: " + getName() + "(" + getYear() + ")";
    }
}

