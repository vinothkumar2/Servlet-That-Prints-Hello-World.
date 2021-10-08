import javax.servlet.*;
import java.io.*;
public class Test extends GenericServlet{
public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException{
PrintWriter o=res.getWriter();
o.print("Hello World");
}
}	