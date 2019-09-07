import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

@WebServlet("/servlet23")
public class Servlet23 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        File file = new File("/home/piotr/Documents/CodersLab/Module03/WAR_JEE_W_10_Servlets/b_Zadania_Domowe/a_Dzien_2/oop.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                response.getWriter().println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku.");
        }
    }
}
