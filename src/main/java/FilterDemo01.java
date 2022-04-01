import javax.servlet.annotation.WebFilter;
import java.io.IOException;


public class FilterDemo01 implements javax.servlet.Filter {
    public void destroy() {

    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        System.out.println("FilterDemo01收到了请求...");
        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {

    }

}
