package br.com.alura.films.model;

public class Serie extends Tittle {

    // constructor
    public Serie(String name, int year, int seasons) {
        super(name, year);
        this.seasons = seasons;}

    // attributes
    private int seasons;
    private boolean open;
    private int episodesBySeason;

    // get and setters
    public int getSeasons() {
        return seasons;
    }
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
    public boolean isOpen() {
        return open;
    }
    public void setOpen(boolean open) {
        this.open = open;
    }
    public int getEpisodesBySeason() {
        return episodesBySeason;
    }
    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    // to string
    @Override
    public String toString() {
        return "Serie: " + getName() + "(" + (getYear()) + ") " + "Temporadas: " + getSeasons();
    }
}
