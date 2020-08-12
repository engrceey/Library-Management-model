package utils;

import java.util.ArrayList;
import java.util.List;

public class RequestCatalogue {


    private String requestBook;

    /**
     * catalogue1 list is used for collecting users request, when they are asking for same book
     * catalogue2 list is used for collecting users request, when they are asking for different books
     * catalogue3 list is used for collecting users request, when they are asking for different books
     * and with repeating priority
     */
    private final List<LibraryUsers> catalogue1 = new ArrayList<>();
    private final List<LibraryUsers> catalogue2 = new ArrayList<>();
    private final List<LibraryUsers> catalogue3 = new ArrayList<>();


    public List<LibraryUsers> getCatalogue1() {
        return catalogue1;
    }

    public List<LibraryUsers> getCatalogue2() {
        return catalogue2;
    }

    public List<LibraryUsers> getCatalogue3() {
        return catalogue3;
    }

    public String getRequestBook() {
        return requestBook;
    }

    //     requestEntrySheet method populates Catalogues for the Libarian to process
    public String requestEntrySheet() {
        try {

            catalogue1.add(new LibraryUsers("Senior Student" ,"peter","lib042",2,"the hobbit"));
            catalogue1.add(new LibraryUsers("Junior student" ,"philip","lib032",3,"the hobbit"));
            catalogue1.add(new LibraryUsers("Teacher" ,"John","lib012",1,"the hobbit"));

            catalogue2.add(new LibraryUsers("Senior Student" ,"peter","lib042",2,"charlotte"));
            catalogue2.add(new LibraryUsers("Junior student" ,"philip","lib032",3,"the hobbit"));
            catalogue2.add(new LibraryUsers("Teacher" ,"John","lib012",1,"animal farm"));


            catalogue3.add(new LibraryUsers("Junior student" ,"John","lib032",3,"charlotte"));
            catalogue3.add(new LibraryUsers("Senior Student" ,"peter","lib042",2,"the hobbit"));
            catalogue3.add(new LibraryUsers("Junior student" ,"philip","lib032",3,"the book thief"));

            return "catalogue filled";
        }catch (Exception ex) {
            ex.printStackTrace();
            return "error occured loading catalogues";
        }
    }

}
