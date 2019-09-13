package info.darkhipo.hello_fat_jar;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import info.darkhipo.hello_fat_jar.App;

public class TestApp {
	
   @Test
   public void testGreeting() {
	 String[] args = {};
	 App.main(args);
     assertNotNull(App.greeting);
   }
}
