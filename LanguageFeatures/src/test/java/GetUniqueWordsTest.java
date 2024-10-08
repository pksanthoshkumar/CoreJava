import org.example.java17.functionalprogramming.GetUniqueWords;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GetUniqueWordsTest {

    GetUniqueWords words = new GetUniqueWords();

    @Test
    void testUniqueWords () {

        List<String> sentences = Arrays.asList(
                "Java is fun",
                "I love programming in Java",
                "Programming is a great skill to learn",
                "Learning Java is fun"
        );

        Set<String> wordsSet = words.getUniqueWords(sentences);
        assertNotNull  (wordsSet);
        assertEquals(wordsSet.size(), 8);
    }
}
