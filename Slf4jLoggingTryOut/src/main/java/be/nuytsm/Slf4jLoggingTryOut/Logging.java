package be.nuytsm.Slf4jLoggingTryOut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Logging {
	
	private static final Logger logger = LoggerFactory.getLogger(Logging.class);
	
	public static void main(String[] args){
		
		logger.info("Main is executing!!");
		
		logger.info("debug {} info", "ffd");
		
	}

}
