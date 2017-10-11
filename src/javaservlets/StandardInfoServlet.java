package javaservlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/ex1")
public class StandardInfoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StandardInfoServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 ServletContext servletContext = getServletContext();
		response.getWriter().append("Served at: ").append(request.getContextPath()).append('\n');
		response.getWriter().append("Local port: ").append(String.valueOf(request.getLocalPort())).append('\n');
		response.getWriter().append("Protocol: ").append(request.getProtocol()).append('\n');
		response.getWriter().append("Server name: ").append(request.getServerName()).append('\n');
		response.getWriter().append("Server port: ").append(String.valueOf(request.getServerPort())).append('\n');
		response.getWriter().append("Servlet context name: ").append(servletContext.getServletContextName()).append('\n');
		response.getWriter().append("Servlet context path: ").append(servletContext.getContextPath()).append('\n');
		response.getWriter().append("Servlet major version: ").append(String.valueOf(servletContext.getMajorVersion())).append('\n');
		response.getWriter().append("Servlet minor version: ").append(String.valueOf(servletContext.getMinorVersion())).append('\n');
		response.getWriter().append("Servlet info: ").append(servletContext.getServerInfo()).append('\n');
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		new StandardInfoServlet();
		ServletContext servletContext = getServletContext();
		response.getWriter().append("Local port: ").append(String.valueOf(request.getLocalPort())).append('\n');
		response.getWriter().append("Protocol: ").append(request.getProtocol()).append('\n');
		response.getWriter().append("Server name: ").append(request.getServerName()).append('\n');
		response.getWriter().append("Server port: ").append(String.valueOf(request.getServerPort())).append('\n');
		response.getWriter().append("Servlet context name: ").append(servletContext.getServletContextName()).append('\n');
		response.getWriter().append("Servlet context path: ").append(servletContext.getContextPath()).append('\n');
		response.getWriter().append("Servlet major version: ").append(String.valueOf(servletContext.getMajorVersion())).append('\n');
		response.getWriter().append("Servlet minor version: ").append(String.valueOf(servletContext.getMinorVersion())).append('\n');
		response.getWriter().append("Servlet info: ").append(servletContext.getServerInfo()).append('\n');
	

	}

}
