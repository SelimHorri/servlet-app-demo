package myTest_project_pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserProfile")
public class UserProfile extends HttpServlet {
// Begin Class
	
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Begin doPost()
		
		// response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		
		printWriter.println("Welcome "+ username +" "+ password);
		printWriter.println("<script> alert('you logged successfully'); </script>");
		
	// End doPost()
	}
	
// End Class
}
