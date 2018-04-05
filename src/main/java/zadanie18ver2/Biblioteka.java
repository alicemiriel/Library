package zadanie18ver2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Przygotuj program, który wyświetli wszystkich autorów
 * oraz podporządkowną im listę książek oraz, jeżeli autor ma więcej niż 5 książek zwróci informację,
 * że autor jest popularny.
 */

public class Biblioteka {
    private AutorzyFasada autorzyFasada = new AutorzyFasada();
    private KsiazkaFasada ksiazkaFasada = new KsiazkaFasada();

    public List<Author> getAuthors() {
        Map<String, List<Ksiazka>> mappedBooks = mapBooks();
        List<Author> mappedAuthors = mapAuthors();
        List<Author> autors = new ArrayList<>();

        for (Author author : mappedAuthors) {
//            Author tmp = new Author(author.getId(), author.getname(), author.getsurname());
//            tmp.getKsiazki().addAll(mappedBooks.get(author.getId()));
            author.getKsiazki().addAll(mappedBooks.get(author.getId()));
            autors.add(author);
        }
        return autors;
    }

    private List<Author> mapAuthors() {
        List<Map<String, String>> autorzy = autorzyFasada.pobierzAutorow();
        List<Author> autorList = new ArrayList<>();
        for (Map<String, String> map : autorzy) {
            autorList.add(new Author(
                    map.get(AutorzyFasada.AUTHORS_KEYS.ID.getValue()),
                    map.get(AutorzyFasada.AUTHORS_KEYS.NAME.getValue()),
                    map.get(AutorzyFasada.AUTHORS_KEYS.SURNAME.getValue())));
        }

        return autorList;
    }

    private Map<String, List<Ksiazka>> mapBooks() {
        List<Map<String, String>> ksiazki = ksiazkaFasada.pobierzKsiazki();
        Map<String, List<Ksiazka>> mappedBooks = new HashMap<>();
        List<Ksiazka> autorList = new ArrayList<>();
        for (Map<String, String> map : ksiazki) {
            String authorID = map.get(KsiazkaFasada.BOOK_KEYS.AUTHOR.getValue());
            if (!mappedBooks.containsKey(authorID)) {
                mappedBooks.put(authorID, new ArrayList<>());
            }
            List<Ksiazka> oldBooks = mappedBooks.get(authorID);
            oldBooks.add(new Ksiazka(
                    map.get(KsiazkaFasada.BOOK_KEYS.TITLE.getValue()),
                    map.get(KsiazkaFasada.BOOK_KEYS.CENA.getValue())));
        }

        return mappedBooks;
    }

}
