import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet242")
public class Servlet242 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String products[] = {
                "Asus Transformr;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };
        Integer id = Integer.parseInt(request.getParameter("id"));

        if (id < 0 || products.length <= id) {
            response.getWriter().println("Product not found");
        } else {
            String[] elem = products[id].split(";");
            response.getWriter().append(elem[0] + " - " + elem[1] + "zl");
        }
    }
}
