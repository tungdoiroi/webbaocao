package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LocalFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String lang = servletRequest.getParameter("lang");
        if(lang != null ){
            req.getSession().setAttribute("LANG",lang);
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
