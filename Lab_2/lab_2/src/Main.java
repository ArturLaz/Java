import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        System.out.print("Введіть спеціальний символ #1: ");
        char specialChar1 = scanner.next().charAt(0);

        System.out.print("Введіть спеціальний символ #2: ");
        char specialChar2 = scanner.next().charAt(0);

        // Виведення початкового тексту
        System.out.println("Початковий текст: " + text);

        // Видалення символів між спеціальними символами
        StringBuilder stringBuilder = new StringBuilder();
        boolean skip = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == specialChar1) {
                skip = true;
            } else if (c == specialChar2) {
                skip = false;
            } else if (!skip) {
                stringBuilder.append(c);
            }
        }
        String processedText = stringBuilder.toString();

        // Виведення опрацьованого тексту
        System.out.println("Опрацьований текст: " + processedText);

        // Підрахунок кількості слів у опрацьованому тексті
        String[] words = processedText.split("\\s+");
        int wordCount = words.length;

        // Виведення кількості слів
        System.out.println("Кількість слів: " + wordCount);
    }
}