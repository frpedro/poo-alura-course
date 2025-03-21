package br.com.alura.films.main;

import br.com.alura.films.model.Movie;
import br.com.alura.films.model.Serie;
import br.com.alura.films.model.Tittle;

import java.util.*;

public class MainList {
    public static void main(String[] args) {

        // create objects
        var scarface = new Movie("Scarface", 1973);
        var smurf2 = new Movie("Smurf 2", 2005);
        var euphoria = new Serie("Euphoria", 2019, 2);

        // add the objects to the list
        var catalog = new ArrayList<Tittle>();
        catalog.add(scarface);
        catalog.add(smurf2);
        catalog.add(euphoria);

        // object reference
        var eph = euphoria;

        // for print list
        for (Tittle catalogPrint: catalog){
            System.out.println(catalogPrint);}

        // new list of artists
        List<String> artists = new ArrayList<>();
        artists.add("Adam Sandler");
        artists.add("Patrick");
        artists.add("Antony");

        // sort year the catalog list
        catalog.sort(Comparator.comparing(Tittle::getYear));
        System.out.println("Ordenado por ano: " + catalog);

        // create linkedlist
        List<Tittle> linked  = new LinkedList<>();
    }
}