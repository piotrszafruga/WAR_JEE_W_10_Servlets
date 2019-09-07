package b_Zadania_Domowe.a_Dzien_1;

public class Main3 {

    static boolean verifyLogin(String email) {
        return email.matches("^\\d[\\w-]{4,}$");
    }

}
