package myTest_project_pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
// Begin Class
	
	private static final long serialVersionUID = 1L;
    
//	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		// response.getWriter().append("Served at: ").append(request.getContextPath());
//		
//		PrintWriter printWriter = response.getWriter();
//		printWriter.println("My name is Slim Horri !!!!!!!!!!!\t"+ request.getParameter("firstname") +",,"+request.getParameter("lastname"));
//		
//	}
    
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// Begin doPost()
		
		// response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		
		if ( (username.equalsIgnoreCase("Slim")) && (password.equals("123")) ) {
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("UserProfile");
			requestDispatcher.forward(request, response);
			
		}
		else {
			
			printWriter.println("Wrong username/password");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/loginDemo.html");
			requestDispatcher.include(request, response);
			printWriter.println("<script> alert('Wrong !!!!!!'); </script>");
			
		}
		
	// End doPost()
	}
	
// End Class
}
