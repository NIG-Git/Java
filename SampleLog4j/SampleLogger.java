package sysblo.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SampleLogger {

	/*** 1 ***/
	private static Logger LOGGER;

	public static void main(String[] args){

		/*** 2 ***/
		LOGGER = LogManager.getLogger();

		/*** 3 ***/
		LOGGER.info("Result {}!!", outputLog());

	}

	/*** 4 ***/
	private static String outputLog(){

		LOGGER.trace("TraceMessage");
		LOGGER.debug("DebugMessage");
        LOGGER.info("InfoMessage");
        LOGGER.warn("WarnMessage");
        LOGGER.error("ErrorMessage");
        LOGGER.fatal("FatalMessage");

        return "Success";

	}

}
