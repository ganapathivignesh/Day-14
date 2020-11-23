package com.log;

import org.apache.log4j.Logger;

public class Loggerex {
	
	static Logger log=Logger.getLogger(Loggerex.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("this is debugging");
		log.info("this is info");
	}

}
