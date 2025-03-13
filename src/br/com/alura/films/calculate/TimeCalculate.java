package br.com.alura.films.calculate;

import br.com.alura.films.model.Tittle;

public class TimeCalculate {

    // attributes
    private int allTime;

    // get
    public int getAllTime() {
        return this.allTime;
    }

    // method for sum minutes of selected movies
    public void include(Tittle tittle) {
        this.allTime += tittle.getMinutesDuration();
    }

}
