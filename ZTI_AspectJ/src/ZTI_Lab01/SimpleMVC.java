package ZTI_Lab01;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class SimpleMVC
 */
@WebServlet("/SimpleMVC")
public class SimpleMVC extends HttpServlet {
    private static final long serialVersionUID = 1L;
        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleMVC() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // response.getWriter().append("Served at: ").append(request.getContextPath());
        System.out.println("In the servlet. . .");
        // String site = request.getParameter("site");
        ServletContext sc = getServletConfig().getServletContext();
        RequestDispatcher rd = null;
        String site  = "";
        if (request.getParameterMap().containsKey("site")) {
            site = request.getParameter("site");
            System.out.println("Site parameter " + site );
        } else {            
            rd = sc.getRequestDispatcher("/mvc/Home.jsp");
            rd.forward(request, response);
      return;           
        }
        if ( site.equals("Site1")) {
            System.out.println("In the servlet. . . Site1");
            rd = sc.getRequestDispatcher("/mvc/Site1.jsp");
            rd.forward(request, response);
      return;
        } else if ( site.equals("Site2")) {
            System.out.println("In the servlet. . . Site2");
            rd = sc.getRequestDispatcher("/mvc/Site2.jsp");
            rd.forward(request, response);
      return;
        } else if ( site.equals("Site3")) {
            System.out.println("In the servlet. . . Site3");
            rd = sc.getRequestDispatcher("/mvc/Site3.jsp");
            rd.forward(request, response);
      return;
        } else {
            System.out.println("In the servlet. . . Home");
            rd = sc.getRequestDispatcher("/mvc/Home.jsp");
            rd.forward(request, response);
      return;
        }       
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
 
}