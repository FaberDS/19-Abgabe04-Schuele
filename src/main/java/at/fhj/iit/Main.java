package at.fhj.iit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args){
        System.out.println("Hello World");
        LOGGER.debug("This is a debug log.");
        LOGGER.info("This is a info log.");
        LOGGER.warn("This is a warning log.");
        LOGGER.error("This is error log.", new NullPointerException());
        LOGGER.fatal("This is fatal log.");
        LOGGER.trace("This is a trace log.");
    }
}
