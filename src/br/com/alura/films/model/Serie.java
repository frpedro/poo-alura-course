package br.com.alura.films.model;

public class Serie extends Tittle {

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

}
