package helper;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Randomizer {
    //3 methods
    //1 - random number - 1-5
    //2- random word with n symbols
    //3-random email with symbols and numbers

    public static int randomNumberForStarts() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }

    public static String randomWord(int countLetters) {
       return RandomStringUtils.randomAlphabetic(countLetters);
    }

    public static String randomWordsAndNumbers(int countSymbols) {
        return RandomStringUtils.randomAlphanumeric(countSymbols);
    }

    public static String randomEmail(int countSymbols) {
        StringBuilder stringBuilder = new StringBuilder();
        String end = "@gmail.com";
        String wordsAndNumbers = randomWordsAndNumbers(countSymbols);
        stringBuilder.append(wordsAndNumbers);
        stringBuilder.append(end);
        return stringBuilder.toString();
    }
}
