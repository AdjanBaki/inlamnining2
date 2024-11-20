import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextStatsTest {

    @Test
    void testAddOneLine() { // Kontrollerar att en rad korrekt ökar antalet rader i objektet TextStats
        // Arrange
        TextStats stats = new TextStats();

        // Act
        stats.incrementLines(); // Lägg till en rad

        // Assert
        int expected = 1; // Förväntat värde
        int actual = stats.getTotalLines(); // Faktiskt värde
        assertEquals(expected, actual, "Antalet rader stämmer inte. Förväntat: " + expected + ", Faktiskt: " + actual);
    }



    @Test
    void testAddChars() { // kontrollerar att det korrekt lägger till antalet tecken som lagras i objektet.
        // Arrange
        TextStats stats = new TextStats();

        // Act
        stats.addChars(10);
        stats.addChars(5);

        // Assert
        int expected = 15; // Förväntat värde
        int actual = stats.getTotalChars(); // Faktiskt värde
        assertEquals(expected, actual, "Antalet tecken stämmer inte. Förväntat: " + expected + ", Faktiskt: " + actual);

    }

    @Test
    void testAddTwoLines() {
        // Arrange
        TextStats stats = new TextStats();

        // Act
        stats.incrementLines(); // Lägg till första raden
        stats.incrementLines(); // Lägg till andra raden

        // Assert
        int expectedLines = 2; // Förväntat antal rader
        int actualLines = stats.getTotalLines(); // Faktiskt antal rader
        assertEquals(expectedLines, actualLines, "Antalet rader stämmer inte. Förväntat: " + expectedLines + ", Faktiskt: " + actualLines);
    }

}
