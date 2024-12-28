import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public class SortUniqueWords {

    public static void sortText(String text)
    {
        String[] words = text.toLowerCase().split("\\s+");
        Arrays.sort(words);
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println(uniqueWords);
    }

}
