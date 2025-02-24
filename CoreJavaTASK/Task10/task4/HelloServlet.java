import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Welcome to FitLife Gym!</h1>");
        out.println("<p>At FitLife Gym, we offer the best equipment and services to help you reach your fitness goals.</p>");
        
        // Gym Description
        out.println("<h2>Our Facilities:</h2>");
        out.println("<ul>");
        out.println("<li>State-of-the-art cardio equipment</li>");
        out.println("<li>Free weights and strength training areas</li>");
        out.println("<li>Group exercise classes (Yoga, Zumba, etc.)</li>");
        out.println("<li>Personal training services</li>");
        out.println("<li>Locker rooms with showers</li>");
        out.println("</ul>");
        
        // Membership Options
        out.println("<h2>Membership Plans:</h2>");
        out.println("<p>We offer various membership options to suit your needs:</p>");
        out.println("<ul>");
        out.println("<li>Monthly Membership: $50 per month</li>");
        out.println("<li>Annual Membership: $500 per year</li>");
        out.println("<li>Student Discount: 10% off on all memberships</li>");
        out.println("</ul>");
        
        // Contact Information
        out.println("<h2>Contact Us:</h2>");
        out.println("<p>For inquiries, visit us at:</p>");
        out.println("<p>123 Fitness Blvd, Health City</p>");
        out.println("<p>Call us: (123) 456-7890</p>");
        
        out.println("</body></html>");
    }
}
