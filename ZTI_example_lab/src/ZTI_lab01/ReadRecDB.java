package ZTI_lab01;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;     
import java.sql.ResultSet;         
 
/**
 * Servlet implementation class ReadRecDB
 */
@WebServlet("/ReadRecDB")
public class ReadRecDB extends HttpServlet {
    private static final long serialVersionUID = 1L;
        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadRecDB() {
        super();
        // TODO Auto-generated constructor stub
    }
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        out.println("<h1>The data from the PostgreSQL database</h1>") ;
      
        try
        {
             Class.forName("org.apache.derby.jdbc.ClientDriver");
       // url = "jdbc:postgresql://host:port/database" 
             String url = "jdbc:postgresql://qdjjtnkv.db.elephantsql.com:5432/xggfrvfc";
             String username = "xggfrvfc" ;
             String password = "q1gFyHQUPS0ZkVzS9nqmlshn0CzDNGgC" ;
             Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             String sql = "SELECT * FROM PERSON";
             ResultSet rs = stmt.executeQuery( sql );
             out.println("<table>") ;
             out.println("<tr><th>ID</th><th>Firstname</th><th>Lastname</th><th>City</th></tr>") ;
             while(rs.next())  {
                out.print("<tr><td>" + rs.getInt("ID") + "</td><td>" + rs.getString("FNAME") + "</td>" ) ;
                out.println ( "<td>" + rs.getString("LNAME") + "</td><td>" + rs.getString("CITY") + "</td></tr>" ) ;
             }   
            out.println("</table>") ;
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(Exception e)
        {  out.println (e) ; } 
         
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // response.getWriter().append("Served at: ").append(request.getContextPath());
        processRequest(request, response);
         
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        processRequest(request, response);
    }
 
}