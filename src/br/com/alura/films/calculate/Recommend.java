package br.com.alura.films.calculate;

import br.com.alura.films.model.Tittle;

public class Recommend {

    // filter method, check if the note is high and rank
    public void filter(Classification classification) {

        if (classification.getClassification() >= 4) {
            System.out.println("Entre os preferidos do momento");
        }
        else if (classification.getClassification() > 2) {
            System.out.println("Bem avaliado");
        }
        else {
            System.out.println("Outros");
        }

    }
}
