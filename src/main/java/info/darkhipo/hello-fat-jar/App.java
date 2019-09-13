package info.darkhipo.hello_fat_jar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    static final Logger logger = LoggerFactory.getLogger(App.class);
    public static String greeting; 

    public static void main(String[] args) {
      App.greeting = "Hello from FatJar!";
      logger.info(App.greeting);
    }

}
