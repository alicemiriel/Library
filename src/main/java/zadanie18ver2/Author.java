package zadanie18ver2;

import java.util.ArrayList;
import java.util.List;

public class Author {
    String id;
    String name;
    String surname;
    List<Ksiazka> ksiazki = new ArrayList<>();

    public Author(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getsurname() {
        return surname;
    }

    public List<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    @Override
    public String toString() {
        return String.format("Imie: %s, nazwisko: %s ksiazek %s", name, surname, "\n" + ksiazki +"\n");
    }
}
