import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/servlet33")
public class Servlet33 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        for (int i = 0; i <5; i++) {
            session.setAttribute("sessionAtt" + i, request.getParameter("att" + i));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        response.getWriter().append("<form action='servlet33' method='POST'>");
        for (int i = 0; i <5; i++) {
            String sessionAtt = (String) session.getAttribute("sessionAtt" + i);

            if (sessionAtt != null) {
                String value = (String) sessionAtt;
                response.getWriter()
                        .append("<input type='text' name='att"+Integer.toString(i)+"' value='"+value+"'>");
            } else {
                response.getWriter()
                        .append("<input type='text' name='att"+Integer.toString(i)+"'>");
            }

            response.getWriter().append("</br>");

        }
        response.getWriter()
                .append("<input type='submit'>")
                .append("</form>");
    }
}
