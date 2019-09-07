import com.google.common.collect.Lists;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double value = Double.parseDouble(request.getParameter("value"));
        Integer id = Integer.parseInt(request.getParameter("rate"));
        List<Double> exchange_rates = Lists.newArrayList(2.0,0.5,4.0,0.25,3.0,0.33);

        response.getWriter().println(value * exchange_rates.get(id));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
