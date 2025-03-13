package br.com.alura.films.model;

import br.com.alura.films.calculate.Recommend;
import br.com.alura.films.calculate.TimeCalculate;

public class Main {
    public static void main(String[] args) {

        // create and set a new film (scarface)
        Movie scarface = new Movie();
        scarface.setYear(1973);
        scarface.setMinutesDuration(200);

        // get note of film
        scarface.note(8);
        scarface.note(10);
        scarface.note(10);

        // show results
        System.out.println("O filme foi avaliado: " + scarface.getTotalReviews() + " vezes");
        System.out.println("E a media foi: " + scarface.ratingAverage());

        // calculates the time needed to watch the selected movies
        TimeCalculate calculadora = new TimeCalculate();
        calculadora.include(scarface);
        System.out.println(calculadora.getAllTime());

        // create a filter to ranking the movie
        Recommend filter = new Recommend();
        filter.filter(scarface);

        // create a new episode and set its attributes
        Episode episodio1 = new Episode();
        episodio1.setName("A procura de um lar");
        episodio1.setNumber(2);
        episodio1.setTotalViews(5000);

        // filter episode
        filter.filter(episodio1);

    }
}