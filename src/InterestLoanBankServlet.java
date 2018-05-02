import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.geom.FlatteningPathIterator;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InterestLoanBankServlet", urlPatterns = "/calculate-interest-bank")
public class InterestLoanBankServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float money = Float.parseFloat(request.getParameter("money"));
        float rate = Float.parseFloat(request.getParameter("rate"));
        int months = Integer.parseInt(request.getParameter("months"));

        float totalMoney = money + money * rate * months;

        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<h1>" + "Amount of loan = " + money + "</h1");
        writer.print("<br>");
        writer.print("<h1>" + "Rate = " + rate + "</h1>");
        writer.print("<h1>" + "Months = " + months + "</h1>");
        writer.print("<h1>" + "Total money = " + totalMoney + "</h1>");
        writer.print("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
