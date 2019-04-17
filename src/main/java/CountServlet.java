import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/count")
public class CountServlet extends HttpServlet {
    int count = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        count++;
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title></title></head><body>" );
        response.getWriter().println("<h2>This page accessed " + this.count + " times </h2>");
        response.getWriter().println("</body></html>");
    }
}
