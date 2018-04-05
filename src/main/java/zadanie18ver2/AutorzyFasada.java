package zadanie18ver2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutorzyFasada {
    public List<Map<String, String>>    pobierzAutorow() {
        List<Map<String, String>> autorzy = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Map<String, String> map = new HashMap<>();
            map.put(AUTHORS_KEYS.ID.getValue(), "ID_" + i);
            map.put(AUTHORS_KEYS.NAME.getValue(), "imie " + i);
            map.put(AUTHORS_KEYS.SURNAME.getValue(), "nazwisko " + i);
            autorzy.add(map);
        }

        return autorzy;
    }


    enum AUTHORS_KEYS {
        ID("id"), NAME("imie"), SURNAME("nazwisko");

        AUTHORS_KEYS(String value) {
            this.value = value;
        }

        String value;

        public String getValue() {
            return value;
        }

    }
}
