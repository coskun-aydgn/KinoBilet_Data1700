package org.example.kinobilet_data1700;

public class Film {
    private String categori, filmNavn;

    public Film(String categori, String filmNavn) {
        this.categori = categori;
        this.filmNavn = filmNavn;
    }

    public String getCategori() {
        return categori;
    }

    public void setCategori(String categori) {
        this.categori = categori;
    }

    public String getFilmNavn() {
        return filmNavn;
    }

    public void setFilmNavn(String filmNavn) {
        this.filmNavn = filmNavn;
    }
}
