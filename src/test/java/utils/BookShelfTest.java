package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookShelfTest {

    @Test
    @DisplayName("Queries map for Book")
    void getBook() throws IOException {
        BookShelf bookShelf = new BookShelf();

//        Case where book has been borrowed and quantity is remaining zero
        assertEquals("book taken", bookShelf.getBook("the hobbit"));

//        case where book is not in the library
        assertEquals("Sorry book not Available",bookShelf.getBook("Decagon handbook"));

//        case where book is available in library
        assertEquals("8 still available", bookShelf.getBook("the great gatsby"));
    }
}