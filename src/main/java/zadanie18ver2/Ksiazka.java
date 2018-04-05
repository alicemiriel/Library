package zadanie18ver2;

public class Ksiazka {

    String title;
    String cena;

    public Ksiazka(String title, String cena) {
        this.title = title;
        this.cena = cena;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return String.format("Tytul %s w cenie %s", title, cena);
    }
}

