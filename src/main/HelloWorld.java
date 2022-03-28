package main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {
	
	public static void main(String[] arg) {
		Logger logger = Logger.getLogger(HelloWorld.class.getName());
        logger.log(Level.INFO,"Hello World!");
    }
}
