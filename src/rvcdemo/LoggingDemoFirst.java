package rvcdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.*;


public class LoggingDemoFirst {

    private static Logger demoLogger = LogManager.getLogger(LoggingDemoFirst.class.getName());

    public static void main(String[] args) {
        demoLogger.info("Click Successfull");
        demoLogger.error("DB Connection failed!");
        demoLogger.debug("This is debug");
        demoLogger.fatal("This is fatal");
    }   
    
}



