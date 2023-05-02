package com.Logger.Logger;

import java.io.IOException;


import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.jdbc.JDBCAppender;
import org.apache.log4j.xml.XMLLayout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerApplication {

	//we createt logger variable with Log4j
	private static Logger logger=Logger.getLogger(LoggerApplication.class);
	
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(LoggerApplication.class, args);
		
		//We describe the fromat with log will print
//		Layout layouts = new SimpleLayout();
//		Layout layouts = new HTMLLayout();
//		Layout layouts = new XMLLayout();
		
		Layout layouts = new PatternLayout("%p %d %C %L %M %n");



		//where we want to store console
		Appender app= new ConsoleAppender(layouts);
//		Appender app= new FileAppender(layouts, "C:\\Rahul\\Rathod.log");
//		Appender app= new JDBCAppender();

		

		
		logger.addAppender(app);
		
		
		logger.info("this is the info log");
		logger.debug("this is the debug log");
		logger.trace("this is the trace log");
		logger.error("this is the error log");
		logger.fatal("this is the fatal log");
		logger.warn("this is the warn log");
		
		System.out.println("First run:");
		
	}

}
