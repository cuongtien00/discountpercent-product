import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discountServlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String des = request.getParameter("des");
float price = Float.parseFloat(request.getParameter("price"));
float percent = Float.parseFloat(request.getParameter("discount"));
float amount = (float) (price*percent*0.01);

PrintWriter writer = response.getWriter();
writer.println("<html>");
writer.println("<h3>Des: "+des+"</h3>");
writer.println("<h3>gia niem yet: "+price+"</h3>");
writer.println("<h3>discount percent: "+percent+"</h3>");
writer.println("<h3>Grand total: "+amount+"</h3>");
writer.println("</html>");
    }
}
