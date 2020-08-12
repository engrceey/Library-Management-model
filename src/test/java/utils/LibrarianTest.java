package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibrarianTest {

    @Test
    @DisplayName("Lends book by Priority")
//    Librarian accept request by rank and checks bookshelf for the book
    void lendBookByPriority() throws IOException {
        Librarian librarian = new Librarian("john","034");
        assertEquals("charlotte",librarian.lendBookFirstComeFirstServe());

    }

    @Test
    @DisplayName("Lends book by First come first serve")
//   Librarian accept request by First entry and checks bookshelf for the book
    void lendBookFirstComeFirstServe() throws IOException {
        Librarian librarian = new Librarian("peeter","024");
        assertEquals("the hobbit",librarian.lendBookByPriority());
    }
}