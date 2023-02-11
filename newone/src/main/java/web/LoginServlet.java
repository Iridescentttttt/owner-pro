package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import pojo.User;
import service.UserService;

import java.io.IOException;

/**
 * @author HDH
 * @version 1.0
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service = new UserService();
    protected void doGot(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = service.login(username,password);
        if(user != null){
            HttpSession session=request.getSession();
            session.setAttribute("user",user);

            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/selectAllServlet");
        }else{
            request.setAttribute("login_msg","用户名和密码错误");
            request.getRequestDispatcher("/login.html").forward(request,response);
        }
    }
}
