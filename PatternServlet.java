package project;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UniquePattern")


public class PatternServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;
    public Patterns obj = new Patterns(); // Instance of patterns class

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Pattern Generator</title></head>");
        out.println("<body>");
        out.println("<h2>Choose a pattern to generate:</h2>");
        out.println("<form method=\"post\">");
        out.println("<select name=\"pattern\">");
        out.println("<option value=\"1\">Solid Rectangle</option>");
        out.println("<option value=\"2\">Hollow Rectangle</option>");
        out.println("<option value=\"3\">Half Pyramid</option>");
        out.println("<option value=\"4\">Inverted Half Pyramid</option>");
        out.println(" <option value=\"5\">Inverted and Rotated Half Pyramid</option>");
        out.println(" <option value=\"6\">Half Pyramid with Numbers</option>");
        out.println("<option value=\"7\"> Inverted Half Pyramid with Numbers</option>");
        out.println("<option value=\"8\">Floyd's Triangle</option>");
        out.println(" <option value=\"9\">Butterfly</option>");
        out.println("<option value=\"10\"> Solid Rhombus</option>");
        out.println(" <option value=\"11\">Number Pyramid</option>");
        out.println(" <option value=\"12\">Diamond</option>");
        out.println("</select>");
        out.println("<input type=\"submit\" value=\"Generate Pattern\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user input from the request object
        String patternChoice = request.getParameter("pattern");
        String rowsParam = request.getParameter("rows");
        String columnsParam = request.getParameter("columns");

        if (rowsParam == null || columnsParam == null) 
        {
            // Handle missing parameters
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>Error: Missing rows or columns parameter</body>");
            out.println("<a href=\"index.html\">Generate Pattern</a>");
            out.println("</html>");
		
            return;
        }

        int n, m;
        try {
            n = Integer.parseInt(rowsParam);
            m = Integer.parseInt(columnsParam);
        } catch (NumberFormatException e) {
            // Handle invalid integer format
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">"); // Link to the CSS file
            out.println("</head>");
            out.println("<body>\n");
            out.println("<h2>Error.............</h2>");
            out.println("<h2>Enter proper rows and columns</h2>");
            out.println("<a href=\"index.html\">Generate Pattern</a>");
            out.println("</html>");
            return;
        }
        // Set the content type of the response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Generated Pattern</title>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">"); // Link to the CSS file
        out.println("</head>");
        out.println("<body>");
      
        out.println("<h2>Generated Pattern </h2>");
        out.println("<pre>");

        switch (patternChoice) {
        case "1":
        	out.println(obj.solidRectangle(n, m,40));
            break;
        case "2":
        	out.println(obj.hollowRectangle(n,m,40));
            break;
        case "3":
        	out.println(obj.halfPyramid(n,40));
            break;
        case "4":
        	out.println(obj.invertedHalfPyramid(n,40));
            break;
        case "5":
        	out.println(obj. invertedAndRotatedHalfPyramid(n,40));
            break;
        case "6":
        	out.println(obj.halfPyramidWithNumbers(n,40));
            break;
        case "7":
        	out.println(obj.invertedHalfPyramidWithNumbers(n,40));
            break;
        case "8":
        	out.println(obj. floydsTriangle(n,40));
            break;
        case "9":
        	out.println(obj.butterfly(n,40));
            break;
        case "10":
        	out.println(obj.solidRhombus(n,40));
            break;
        case "11":
        	out.println(obj.numberPyramid(n,40));
            break;
        case "12":
        	out.println(obj.diamond(n,40));
            break;
        default:
            out.println("Invalid choice!");
    }

        

        out.println("</pre>");
        out.println("<a href=\"index.html\">Generate Another Pattern</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
