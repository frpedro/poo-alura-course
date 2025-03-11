public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void showPrints() {
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println(incluidoNoPlano);
        System.out.println(somaDasAvaliacoes);
        System.out.println(totalDeAvaliacoes);
        System.out.println(duracaoEmMinutos);
    }

    void avalible(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double averageFilm() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
