import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet351")
public class Servlet351 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String product = request.getParameter("product");
        String priceStr = request.getParameter("price");
        String amountStr = request.getParameter("amount");
        System.out.println(product+","+priceStr+","+amountStr);

        if(product != null && priceStr != null && amountStr != null) {
            String[] deal = {priceStr, amountStr};
            Map<String,String[]> basketMap = (Map<String,String[]>) session.getAttribute("basket");
            if (basketMap == null) {
                basketMap = new HashMap<String, String[]>();
            }
            basketMap.put(product, deal);
            session.setAttribute("basket",basketMap);
        }

        response.getWriter().append("<form action='servlet351' method='POST'>")
                .append("Product: <input type='text' name='product'>")
                .append("</br>")
                .append("Price : <input type='number' name='price'>")
                .append("</br>")
                .append("Amount: <input type='number' name='amount'>")
                .append("</br>")
                .append("<input type='submit' name='add' value='Add product'>")
                .append("</br>")
                .append("</form>");

        response.getWriter().append("<form action='servlet352' method='POST'>")
                .append("<input type='submit' value='Go to basket'>")
                .append("</form>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
