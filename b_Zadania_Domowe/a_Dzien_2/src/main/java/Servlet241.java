import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet241")
public class Servlet241 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        for (int i = 0; i <= 7; i++) {
            response.getWriter().append("<a href='http://localhost:8080/a_Dzien_2_war_exploded/servlet242?id="+
                    i+
                    "'>link</a>");
            response.getWriter().append("</br>");
        }
    }
}
