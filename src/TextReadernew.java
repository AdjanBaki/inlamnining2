import java.util.Scanner;

public class TextReadernew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextStats stats = new TextStats();

        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");

        while (true) {
            String input = scanner.nextLine();

            if ("stop".equalsIgnoreCase(input)) { // Kontrollera om användaren skriver "stop"
                System.out.println("Programmet avslutas...");
                break;
            }

            stats.incrementLines(); // Öka antalet rader
            stats.addChars(input.length()); // Lägg till antalet tecken från raden

            System.out.println("Du skrev: " + input);
        }

        // Skriv ut statistiken
        System.out.println("Antal rader: " + stats.getTotalLines());
        System.out.println("Antal tecken: " + stats.getTotalChars());

        scanner.close();
    }
}
