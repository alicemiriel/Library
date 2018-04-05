package zadanie18ver2;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Author> authors = new Biblioteka().getAuthors();
        for (Author a : authors) {
            System.out.println("("+a.getId() + ")");
            if (a.isFamous()){
                System.out.println("*");
            }else {
                System.out.println(" ");
            }
            System.out.println(a.getsurname());
        }
    }
}

