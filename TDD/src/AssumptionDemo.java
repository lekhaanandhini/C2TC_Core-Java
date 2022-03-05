import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
    @Test    
	void TestonDev() {
        	System.setProperty("ENV", "DEV");
        	Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV"))); 
        }
    @Test
    void TestonProd() {
    	System.setProperty("ENV", "PROD");
    	Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV"))); 
    }

}
