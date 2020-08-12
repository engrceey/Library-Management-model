package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BookShelf {

    //    books field used as a container for storing book titles and quantity
    private final Map<String,String> books = new HashMap<>();


    //    To avoid loading 20 books manually to the books map
//    the loadBooksFromTextFile method was used to read books from file and load them to map
    private void loadBooksFromTextFile() throws IOException {
        try (
                FileReader fileReader = new FileReader("books.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String textLine;
            while ((textLine = bufferedReader.readLine()) != null) {
                String[] strArr = textLine.split("=");
                books.put(strArr[0], strArr[1]);
            }

        } catch (IOException e) {
            System.out.println("An Error Occurred");
        }
    }

    //    getBook method is use for querying the books container to check if a book is available and lends it
//    getBook method is also use for keeping counts of collected books
    public String getBook(String bookName) throws IOException {
        loadBooksFromTextFile();

        try {
            if(!books.containsKey(bookName)){
                System.out.println("Sorry book not Available");
                return "Sorry book not Available";
            }
            if(books.containsKey(bookName.toLowerCase())) {
                if(Integer.parseInt(books.get(bookName))  == 0) {
                    System.out.println("All copies have been given out");
                    return "book taken";
                }else {
                    int numOfCopies = Integer.parseInt(books.get(bookName)) - 1;
                    books.put(bookName,String.valueOf(numOfCopies));
                    System.out.println(books.get(bookName)+" still available");
                    return books.get(bookName)+" still available";
                }
            }
        }catch (Exception ex) {
            ex.printStackTrace();
            return "error occured";
        }

        return "executed";
    }

}
