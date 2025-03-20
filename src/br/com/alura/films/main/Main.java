package br.com.alura.films.main;

import br.com.alura.films.calculate.Recommend;
import br.com.alura.films.calculate.TimeCalculate;
import br.com.alura.films.model.Episode;
import br.com.alura.films.model.Movie;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // create and set a new movie (scarface)
        var scarface = new Movie("Scarface", 1973);
        scarface.setYear(1973);
        scarface.setMinutesDuration(200);

        // get note of movie
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
        var filter = new Recommend();
        filter.filter(scarface);

        // create a new episode and set its attributes
        var episodio1 = new Episode();
        episodio1.setName("A procura de um lar");
        episodio1.setNumber(2);
        episodio1.setTotalViews(5000);

        // filter episode
        filter.filter(episodio1);

        // create and set a new movie (smurf2)
        var smurf2 = new Movie("Smurf 2", 2007);
        smurf2.setMinutesDuration(200);
        smurf2.setYear(2009);

        // create a new list and adds already declared movies
        var films = new ArrayList<>();
        films.add(scarface);
        films.add(smurf2);

        // show list and your size
        System.out.println("Tamanho da lista: " + films.size());
        System.out.println(films);
    }
}