import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/servlet36")
public class Servlet36 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] numbers = request.getParameterValues("num");
        int[] numb = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
        response.getWriter().append("Liczby: \n")
                .append(numbers[0]+"\n")
                .append(numbers[1]+"\n")
                .append(numbers[2]+"\n")
                .append(numbers[3]+"\n")
                .append("srednia:\n")
                .append("" + (double)Arrays.stream(numb).sum()/numb.length)
                .append("\nsuma: \n")
                .append("" + Arrays.stream(numb).sum())
                .append("\niloczyn: \n")
                .append("" + Arrays.stream(numb).reduce(1, Math::multiplyExact));

    }
}
