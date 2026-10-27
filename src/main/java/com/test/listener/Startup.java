package com.test.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class Startup implements ServletContextListener {
	// ServletContextListener (I) runs at start/stop of the server/application

    public void contextDestroyed(ServletContextEvent sce)  { 
    	// When the application is stopped, then this is an event, for this contextDestroyed() is run
    	
    	/* INFO: Stopping service [Catalina]
    	 * Table deleted...
    	 */
    	
    	System.out.println("Table deleted...");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
        // When the application is started after deployment, then this is an event, for this contextInitialized()
    	// is run.
    	
    	/* INFO: Starting Servlet engine: [Apache Tomcat/9.0.121]
    	 * Table created...
    	 */
    	
    	System.out.println("Table created...");
    }
	
}
