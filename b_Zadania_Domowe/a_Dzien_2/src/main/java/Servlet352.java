import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@WebServlet("/servlet352")
public class Servlet352 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<String, String[]> basket = (HashMap<String, String[]>) session.getAttribute("basket");
        response.getWriter().println("" + basket.size());

        for (Map.Entry entry : basket.entrySet()) {
            Integer price = Integer.parseInt(((String[])entry.getValue())[0]);
            Integer amount = Integer.parseInt(((String[])entry.getValue())[1]);
            response.getWriter().append(entry.getKey() + " - " + amount + " x " + price + "zl")
                    .append(" = " + amount*price + " zl \n");

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
