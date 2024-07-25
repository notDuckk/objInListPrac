package org.example;

public class Books {
    String title;
    int pages;
    int pubYear;

    public Books(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public String everything() {
        return title + ", " + pages + ", " + pubYear;
    }

    @Override
    public String toString() {
        return title + ", " + pages + ", " + pubYear;
    }
}
