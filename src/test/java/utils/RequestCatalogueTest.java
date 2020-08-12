package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RequestCatalogueTest {

    @Test
    @DisplayName("Logs of similar book request")
    void getCatalogue1() {

    }

    @Test
    @DisplayName("Log of different book request with no teacher")
    void getCatalogue3() {

    }

    @Test
    @DisplayName("Populate logs")
    void requestEntrySheet() {
        RequestCatalogue fillLog = new RequestCatalogue();
        assertEquals("catalogue filled",fillLog.requestEntrySheet());
    }
}