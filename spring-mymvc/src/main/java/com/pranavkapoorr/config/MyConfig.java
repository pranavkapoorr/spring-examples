package com.pranavkapoorr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.pranavkapoorr"})
public class MyConfig implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		        // Create the 'root' Spring application context
		        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		        rootContext.register(MyConfig.class);

		        // Manage the lifecycle of the root application context
		        servletContext.addListener(new ContextLoaderListener(rootContext));

		        // Create the dispatcher servlet's Spring application context
		        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
		        
		        // Register and map the dispatcher servlet
		        ServletRegistration.Dynamic dispatcher = servletContext
		                .addServlet("myDispatcher", new DispatcherServlet(dispatcherContext));
		        dispatcher.setLoadOnStartup(1);
		        dispatcher.addMapping("/");
		    
		
	}

   
}