package mypackage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/helloworld2/*")
public class HelloworldServlet extends HttpServlet {
	private static final long serialVersionUID = -7759593256585062849L;
	private static final Logger LOG = LoggerFactory.getLogger(HelloworldServlet.class);

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		LOG.info("serving request");
		File file = new File("./aFile.log");
		ImageInputStream iis = ImageIO.createImageInputStream(file);
		resp.getWriter().println(iis);
	}
}