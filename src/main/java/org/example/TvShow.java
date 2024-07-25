package org.example;

public class TvShow {
    String showName;
    int numEps;
    String genre;

    public TvShow(String showName, int numEps, String genre) {
        this.showName = showName;
        this.numEps = numEps;
        this.genre = genre;
    }

    public String getShowName() {
        return showName;
    }
    public int getNumEps() {
        return numEps;
    }
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getShowName() + " with " + getNumEps() + " episodes. The genre is " + getGenre();
    }

}
