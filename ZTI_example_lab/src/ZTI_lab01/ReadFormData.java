package ZTI_lab01;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class FormPost
 */
@WebServlet("/FormPost")
public class ReadFormData extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadFormData() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        // response.getWriter().append("Served at:// ").append(request.getContextPath());
        PrintWriter out= response.getWriter();
        // sprawdzic, czy nie null!
        String fname = request.getParameterValues("fname")[0] ;
        String lname = request.getParameterValues("lname")[0] ;
        String city = request.getParameterValues("city")[0] ;
        out.println("<h1>The data from the form</h1>") ;
        out.println("<table>") ;
        out.println("<tr><td>Fisrtname</td><td>" +  fname + "</td></tr>");
        out.println("<tr><td>Lastname</td><td>" +  lname + "</td></tr>");
        out.println("<tr><td>City</td><td>" +  city + "</td></tr>");
        out.println("</body></html>");
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
 
}