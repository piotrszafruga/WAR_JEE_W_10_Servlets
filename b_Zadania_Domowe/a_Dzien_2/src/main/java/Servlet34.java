import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet34")
public class Servlet34 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String cookieValue = null;
        for (Cookie c : cookies) {
            if ("visits".equals(c.getName())) {
                Cookie cookie = c;
                Integer visits = Integer.parseInt(c.getValue());
                cookieValue = Integer.toString(visits + 1);
                response.getWriter().append(cookieValue);
                c.setValue(cookieValue);
                response.addCookie(c);
                response.getWriter().append("Witaj, odwiedziłeś nas juz " + visits + " razy");
                break;
            }
        }

        if (cookieValue == null) {
            Cookie newCookie = new Cookie("visits", "1");
            newCookie.setMaxAge(31536000);
            response.addCookie(newCookie);
            response.getWriter().append("Witaj po raz pierwszy na tej stronie");
        }
    }
}
