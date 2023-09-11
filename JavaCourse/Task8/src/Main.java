public class Main {
    public static void main(String[] args) {
        String string = "abc started abc ABC aBc";
        System.out.println(StringFormatter.changeStringByAbcStart(string));

        string = "not abc started";
        System.out.println(StringFormatter.changeStringByAbcStart(string));

        string = "   abc vbg  fgghg     hghgg    ";
        System.out.println(StringFormatter.normalizeString(string));

        string = "Дан текст. Найти наибольшее количество идущих подряд цифр.";
        System.out.println(StringFormatter.findMaxQuantityOfDigits(string));

        string = "Первое самое длиннное слово поменять местами с последним самым коротким словом в  ";
        System.out.println(StringFormatter.replaceFirstMaxLengthWordWithLastMinLengthWord(string));

        string = "Необходимо, подсчитать? количество знаков препинания?.!....";
        System.out.println(StringFormatter.countPunctuationMarks(string));

        String email = "fggh56-gjhj67@rm.bnn";
        System.out.println(StringValidator.isValidEmail(email));

        String ip = "255.255.199.0.0";
        System.out.println(StringValidator.isValidIP(ip));

    }
}

