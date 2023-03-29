package ecart;
public class NamePrinter {
    public static void main(String[] args) {
        String name = "John"; // Replace with your name
        int gap = 2; // Number of rows gap between each alphabet
        int distance = 5; // Number of columns away from the previous alphabet

        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < i * gap; j++) {
                System.out.print(" "); // Add the number of spaces for the row gap
            }
            for (int j = 0; j < distance; j++) {
                System.out.print(" "); // Add the number of spaces for the column distance
            }
            System.out.println(name.charAt(i)); // Print the current alphabet
        }
    }
}