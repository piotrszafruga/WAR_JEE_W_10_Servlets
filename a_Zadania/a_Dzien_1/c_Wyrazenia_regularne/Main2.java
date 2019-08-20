package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {
        System.out.println(verifyPassword("aDDDdFdF9yPi"));
        System.out.println(verifyPassword("a3445a4A45"));
        System.out.println(verifyPassword("1a55678845"));

    }

    static boolean verifyPassword(String password) {
        String regex = "(?=.*[A-Z])(?=.*[a-z])((?![a-z][a-z]|[A-Z][A-Z]).){10,15}"; //"^((?=[0-9])(?!([A-Z][A-Z]|[a-z][a-z])).){10,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        //System.out.println(matcher.matches());
        while (matcher.find()) {
            System.out.println(matcher.group());
            return true;
        }
        return false;
    }

}
