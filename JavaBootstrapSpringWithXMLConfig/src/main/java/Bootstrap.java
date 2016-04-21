import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Bootstrap implements WebApplicationInitializer{
	
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		
		/*XmlWebApplicationContext rootContext = new XmlWebApplicationContext();
		rootContext.setConfigLocation("/WEB-INF/root-context.xml");
		
		container.addListener(new ContextLoaderListener(rootContext));
		
		XmlWebApplicationContext servletContext = new XmlWebApplicationContext();
		servletContext.setConfigLocation("/WEB-INF/servlet-context.xml");*/
		
		AnnotationConfigWebApplicationContext servletContext = new AnnotationConfigWebApplicationContext();
		servletContext.register(ServletConfiguration.class);
		
		ServletRegistration.Dynamic dispatcher = 
				container.addServlet("springServlet", new DispatcherServlet(servletContext));
		dispatcher.addMapping("/");
		
	}
	
}
