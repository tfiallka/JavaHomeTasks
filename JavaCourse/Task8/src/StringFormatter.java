import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StringFormatter {
    static String changeStringByAbcStart(String string) {
        if (string.startsWith("abc")) {
            string = string.replaceFirst("abc", "www");
        } else {
            string = string + "zzz";
        }
        return string;
    }

    static String normalizeString(String string) {
        string = string.trim().replaceAll("\\s{2,}", " ");
        return string;
    }

    static Integer findMaxQuantityOfDigits(String string) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(string);
        int maxQuantityOfDigits = 0;
        if (matcher.find()) {
            maxQuantityOfDigits = matcher.end() - matcher.start();
            while (matcher.find()) {
                if (matcher.end() - matcher.start() > maxQuantityOfDigits) {
                    maxQuantityOfDigits = matcher.end() - matcher.start();
                }
            }
        }
        return maxQuantityOfDigits;
    }

    static String replaceFirstMaxLengthWordWithLastMinLengthWord (String string) {
        String[] wordsInString = string.split(" ");
        if (wordsInString.length != 0) {
            int indexOfWordWithMaxLength = 0;
            int indexOfWordWithMinLength = 0;
            String wordWithMaxLength = wordsInString[indexOfWordWithMaxLength];
            String wordWithMinLength = wordsInString[indexOfWordWithMinLength];
            for (int i = 1; i < wordsInString.length; i++) {
                if (wordWithMaxLength.length() >= wordsInString[i].length()) {
                    wordWithMinLength = wordsInString[i];
                    indexOfWordWithMinLength = i;
                } else {
                    wordWithMaxLength = wordsInString[i];
                    indexOfWordWithMaxLength = i;
                }
            }
            wordsInString[indexOfWordWithMaxLength] = wordWithMinLength;
            wordsInString[indexOfWordWithMinLength] = wordWithMaxLength;
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : wordsInString) {
                stringBuilder.append(word).append(" ");
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    static Integer countPunctuationMarks(String string) {
        Pattern pattern = Pattern.compile("[.,!?:;]");
        Matcher matcher = pattern.matcher(string);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
