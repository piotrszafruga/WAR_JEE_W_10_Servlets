package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static final Pattern pattern = Pattern.compile("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,})");

    public static void main(String[] args) {

    }

    static boolean verifyEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }

}
