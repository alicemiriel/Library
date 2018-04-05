package zadanie18ver2;

import java.util.*;

public class KsiazkaFasada {

    public List<Map<String, String>> pobierzKsiazki() {
        List<Map<String, String>> ksiazki = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            Map<String, String> map = new HashMap<>();
            map.put(BOOK_KEYS.TITLE.getValue(), "tutul" + i);
            map.put(BOOK_KEYS.CENA.getValue(), "" + rand.nextInt(999));
            map.put(BOOK_KEYS.AUTHOR.getValue(), "ID_" + rand.nextInt(5));
            ksiazki.add(map);
        }

        return ksiazki;
    }

    enum BOOK_KEYS {
        TITLE("tytul"), CENA("cena"), AUTHOR("autor");
        String value;

        BOOK_KEYS(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
