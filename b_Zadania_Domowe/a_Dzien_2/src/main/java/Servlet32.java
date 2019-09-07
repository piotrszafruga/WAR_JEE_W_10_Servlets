import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = request.getParameter("value");

        if (str.matches("^[01]*$")) {
            Integer sum = 0;
            String[] digits = str.split("");

            for (int i = 0; i < digits.length; i++) {
                sum += (int) Math.pow(2,digits.length - 1 - i) * Integer.parseInt(digits[i]);
            }
            response.getWriter().println(sum);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
