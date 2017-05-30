package ZTI_Lab01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LabIndex
 */
@WebServlet("/LabIndex")
public class LabIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LabIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        out.println ("<h1>ZTI - Lab01 : Servlets and JSP scripts </h1>");
        out.println ("<ol>");
        out.println ("<li><a href='Servlet01'>[Servlet] First Servlet</a></li>");
        out.println ("<li><a href='ReadReqParam'>[Servlet] Read Request Parameter</a></li>");
        out.println ("<li><a href='FormData.html'>[Servlet] Read the data from the html form</a></li>");
        out.println ("<li><a href='ReadRecDB'>[Servlet (JDBC)] Read the records from the PostgreSQL database</a></li>");
        out.println ("<li><a href='HelloJSP.jsp'>[JSP] Read the JavaBean in JSP script</a></li>");
        out.println ("<li><a href='ReadXmlJSTL.jsp'>[JSP (JSTL)] Read the xml file in JSP script</a></li>");
        out.println ("<li><a href='ReadConfig.jsp'>[JSP] Read the config file in WEB-INF directory</a></li>");
        out.println ("<li><a href='SimpleMVC'>[Servlet & JSP] Simple MVC pattern - dispatch servlet</a></li>");
        out.println ("</ol>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
