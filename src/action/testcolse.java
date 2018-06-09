package action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcolse {
	@RequestMapping("/cc")
	public void close(HttpServletResponse resp) throws IOException {
		System.out.println("123");
		 resp.getWriter().write("<script>WeixinJSBridge.call('closeWindow');</script>");
	}

}
