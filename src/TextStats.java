public class TextStats {
    private int totalChars = 0; // Totalt antal tecken
    private int totalLines = 0; // Totalt antal rader

    // Öka antalet rader
    public void incrementLines() {
        totalLines++;
    }

    // Lägg till antalet tecken från en rad
    public void addChars(int chars) {
        totalChars += chars;
    }

    // Hämta totalt antal rader
    public int getTotalLines() {
        return totalLines;
    }

    // Hämta totalt antal tecken
    public int getTotalChars() {
        return totalChars;
    }
}
