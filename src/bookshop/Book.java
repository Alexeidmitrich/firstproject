package bookshop;

import java.util.ArrayList;
import java.util.List;

public class Book extends PrintEdition {


    private List<Author> authorList = new ArrayList<>();

    public Book(String title, int article, int price, int numberPlace) {
        super(title, article, price, numberPlace, "книжный");
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

}