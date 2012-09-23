package com.blog.samples.quartz;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest
{
	private static final Logger logger_c = Logger.getLogger(RunTest.class);

	public static void main (String [] args)
	{

		logger_c.debug("loading spring application context");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");

		try
		{
			/* sleep thread */
			Thread.sleep(100000);
		}
		catch (InterruptedException ex)
		{
			logger_c.debug(ex);
		}

		/* close down spring application context */
		applicationContext.stop();
		logger_c.debug("exiting...");
	}
}