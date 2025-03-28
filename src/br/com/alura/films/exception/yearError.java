package br.com.alura.films.exception;

public class yearError extends RuntimeException {

    private String errorMensage;

    public yearError(String errorMensage) {
        this.errorMensage = errorMensage;
    }

    @Override
    public String getMessage() {
            return this.errorMensage;
    }

}
