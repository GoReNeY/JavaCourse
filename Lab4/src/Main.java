import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Text originalText = new Text ("""
            Як умру, то поховайте
            Мене на могилі,
            Серед степу широкого,
            На Вкраїні милій,
            Щоб лани широкополі,
            І Дніпро, і кручі
            Було видно, було чути,
            Як реве ревучий.
            """);

        sortAndPrintUniqueWords(originalText);
    }

    private static void sortAndPrintUniqueWords(Text text) {
        // Extract all sentences from the text
        Sentence[] sentences = text.getSentences();

        // Collect all words from all sentences
        Set<String> uniqueWords = new HashSet<>();
        for (Sentence sentence : sentences) {
            Word[] words = sentence.getWords();
            for (Word word : words) {
                uniqueWords.add(word.getWord().toLowerCase());
            }
        }

        // Sort the unique words alphabetically
        String[] sortedWords = uniqueWords.stream()
                .sorted()
                .toArray(String[]::new);

        // Print the sorted list of unique words
        System.out.println("Sorted unique words:");
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}