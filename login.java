import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final String SECRET_CODE = "Kashish";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userCode = request.getParameter("code");

        if (SECRET_CODE.equals(userCode)) {
            response.sendRedirect("main.html");
        } else {
            response.setContentType("text/plain");
            response.getWriter().write("Naa Tum meri baby nhi hoo kon hooo tum kaha hai meri sona");
        }
    }
}
