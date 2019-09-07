import com.google.common.collect.Lists;
import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

//Zadanie 1:
    public static void main(String[] args) {
        LOGGER.info("Mój pierwszy wylogowany tekst");

//Zadanie 2:
        Connection connect = Jsoup.connect("http://www.onet.pl/");
        try {
            Document document = connect.get();
            Elements links = document.select("span.title");
            for (Element elem : links) {
                System.out.println(elem.text());
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
//Zadanie 3:
        List<String> names = Lists.newArrayList("Arek", "Czarek", "Darek");
        List<String> reversed = Lists.reverse(names);
        System.out.println(reversed);
    }

}